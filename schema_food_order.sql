-- =============================
-- FOOD ORDER SYSTEM DATABASE SCHEMA
-- =============================

-- ===== USERS =====
CREATE TABLE users (
    user_id      VARCHAR(50) PRIMARY KEY,
    email        VARCHAR(255) UNIQUE NOT NULL,
    password     VARCHAR(255) NOT NULL,
    name         VARCHAR(100) NOT NULL
);

-- ===== ADDRESSES =====
CREATE TABLE addresses (
    address_id   VARCHAR(50) PRIMARY KEY,
    user_id      VARCHAR(50) NOT NULL,
    full_address TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- ===== RESTAURANTS =====
CREATE TABLE restaurants (
    restaurant_id VARCHAR(50) PRIMARY KEY,
    name          VARCHAR(255) NOT NULL
);

-- ===== MENU ITEMS =====
CREATE TABLE menu_items (
    item_id       VARCHAR(50) PRIMARY KEY,
    restaurant_id VARCHAR(50) NOT NULL,
    name          VARCHAR(255),
    price         NUMERIC(10,2),
    FOREIGN KEY (restaurant_id) REFERENCES restaurants(restaurant_id)
);

-- ===== ORDERS =====
CREATE TABLE orders (
    order_id      VARCHAR(50) PRIMARY KEY,
    user_id       VARCHAR(50),
    restaurant_id VARCHAR(50),
    status        VARCHAR(50),
    created_at    TIMESTAMP DEFAULT NOW()
);

-- ===== ORDER ITEMS =====
CREATE TABLE order_items (
    order_item_id SERIAL PRIMARY KEY,
    order_id      VARCHAR(50),
    item_id       VARCHAR(50),
    quantity      INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id)
);

-- ===== PAYMENTS =====
CREATE TABLE payments (
    payment_id VARCHAR(50) PRIMARY KEY,
    user_id    VARCHAR(50) NOT NULL,
    amount     NUMERIC(10,2),
    status     VARCHAR(50),
    created_at TIMESTAMP DEFAULT NOW()
);
