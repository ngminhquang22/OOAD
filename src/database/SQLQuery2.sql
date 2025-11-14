
    CREATE DATABASE InternetCafeDB;
    GO

    USE InternetCafeDB;
    GO

    CREATE TABLE Customer (
        customer_id VARCHAR(11) PRIMARY KEY,  -- CUS + 8 số
        name VARCHAR(100),
        username VARCHAR(50) UNIQUE,
        password VARCHAR(100),
        phone VARCHAR(20),
        balance DECIMAL(10,2) DEFAULT 0,
        remaining_time INT DEFAULT 0,
        created_at DATETIME DEFAULT GETDATE(),
        status VARCHAR(20)
    );
    GO

    CREATE TABLE Computer (
        computer_id VARCHAR(11) PRIMARY KEY, -- COM + 8 số
        status VARCHAR(20),
        location VARCHAR(100),
        specs TEXT
    );
    GO

    CREATE TABLE Employee (
        employee_id VARCHAR(11) PRIMARY KEY, -- EMP + 8 số
        name VARCHAR(100),
        role VARCHAR(20) DEFAULT 'Employee',
        username VARCHAR(50) UNIQUE,
        password VARCHAR(100),
        phone VARCHAR(20),
        status VARCHAR(20)
    );
    GO

    CREATE TABLE Product (
        product_id VARCHAR(11) PRIMARY KEY, -- PRO + 8 số
        name VARCHAR(100),
        price DECIMAL(10,2),
        stock INT DEFAULT 0,
        category VARCHAR(50),
        status VARCHAR(20)
    );
    GO

    CREATE TABLE UsageSession (
        session_id VARCHAR(11) PRIMARY KEY, -- USE + 8 số
        customer_id VARCHAR(11) FOREIGN KEY REFERENCES Customer(customer_id),
        computer_id VARCHAR(11) FOREIGN KEY REFERENCES Computer(computer_id),
        start_time DATETIME,
        end_time DATETIME,
        total_time_used INT DEFAULT 0,
        total_cost DECIMAL(10,2) DEFAULT 0,
        status VARCHAR(20)
    );
    GO

    CREATE TABLE ServiceRequest (
        request_id VARCHAR(11) PRIMARY KEY, -- SER + 8 số
        session_id VARCHAR(11) FOREIGN KEY REFERENCES UsageSession(session_id),
        customer_id VARCHAR(11) FOREIGN KEY REFERENCES Customer(customer_id),
        employee_id VARCHAR(11) FOREIGN KEY REFERENCES Employee(employee_id),
        type VARCHAR(20), -- TopUp, PlayTime, ProductPurchase
        amount DECIMAL(10,2),
        product_id VARCHAR(11) FOREIGN KEY REFERENCES Product(product_id),
        created_at DATETIME DEFAULT GETDATE(),
        status VARCHAR(20)
    );
    GO

    CREATE TABLE Invoice (
        invoice_id VARCHAR(11) PRIMARY KEY, -- INV + 8 số
        session_id VARCHAR(11) FOREIGN KEY REFERENCES UsageSession(session_id),
        customer_id VARCHAR(11) FOREIGN KEY REFERENCES Customer(customer_id),
        employee_id VARCHAR(11) FOREIGN KEY REFERENCES Employee(employee_id),
        total_amount DECIMAL(10,2),
        discount DECIMAL(10,2) DEFAULT 0,
        final_amount DECIMAL(10,2),
        created_at DATETIME DEFAULT GETDATE()
    );
    GO

    CREATE TABLE InvoiceDetail (
        invoice_detail_id VARCHAR(11) PRIMARY KEY, -- IND + 8 số
        invoice_id VARCHAR(11) FOREIGN KEY REFERENCES Invoice(invoice_id),
        product_id VARCHAR(11) FOREIGN KEY REFERENCES Product(product_id),
        description TEXT,
        quantity INT DEFAULT 1,
        unit_price DECIMAL(10,2),
        subtotal DECIMAL(10,2)
    );
    GO

    DECLARE @NewCustomerID VARCHAR(11);
    SELECT @NewCustomerID = 'CUS' + RIGHT('00000000' + CAST(ISNULL(MAX(CAST(SUBSTRING(customer_id,4,8) AS INT)),0) + 1 AS VARCHAR),8)
    FROM Customer;

    INSERT INTO Customer (customer_id, name, username, password, phone, balance, remaining_time, status)
    VALUES (@NewCustomerID, 'Nguyen Van A', 'nguyena', 'pass123', '0901111111', 500.00, 120, 'Active');
    GO

    DECLARE @NewComputerID VARCHAR(11);
    SELECT @NewComputerID = 'COM' + RIGHT('00000000' + CAST(ISNULL(MAX(CAST(SUBSTRING(computer_id,4,8) AS INT)),0) + 1 AS VARCHAR),8)
    FROM Computer;

    INSERT INTO Computer (computer_id, status, location, specs)
    VALUES (@NewComputerID, 'Available', 'Room 1', 'i5, 8GB RAM, GTX 1050');
    GO

    DECLARE @NewEmployeeID VARCHAR(11);
    SELECT @NewEmployeeID = 'EMP' + RIGHT('00000000' + CAST(ISNULL(MAX(CAST(SUBSTRING(employee_id,4,8) AS INT)),0) + 1 AS VARCHAR),8)
    FROM Employee;

    INSERT INTO Employee (employee_id, name, role, username, password, phone, status)
    VALUES (@NewEmployeeID, 'Le Van C', 'Manager', 'levanc', 'pass789', '0911111111', 'Active');
    GO

    DECLARE @NewProductID VARCHAR(11);
    SELECT @NewProductID = 'PRO' + RIGHT('00000000' + CAST(ISNULL(MAX(CAST(SUBSTRING(product_id,4,8) AS INT)),0) + 1 AS VARCHAR),8)
    FROM Product;

    INSERT INTO Product (product_id, name, price, stock, category, status)
    VALUES (@NewProductID, 'Coca Cola', 10.0, 50, 'Drink', 'Available');
    GO
