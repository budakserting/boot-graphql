CREATE TABLE Book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255)
);
INSERT INTO Book (title, author) VALUES ('First Book', 'Author One');
INSERT INTO Book (title, author) VALUES ('Second Book', 'Author Two');
