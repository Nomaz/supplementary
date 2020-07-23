DROP TABLE BOOK;

CREATE TABLE BOOK (
    bookID INTEGER NOT NULL,
    title VARCHAR(50) NOT NULL,
    author VARCHAR(50) NOT NULL,
    publisher VARCHAR(50) NOT NULL,
CONSTRAINT Book_PK PRIMARY KEY (bookID));


INSERT INTO BOOK(BOOKID, TITLE, AUTHOR, PUBLISHER) VALUES
(343434, 'Harry Porter', 'JK Rowling', 'Konami'),
(121212, 'Eragone', 'Smithers', 'Toshiba'),
(787878, 'The Smithers', 'Anderson P. William', 'Nintendo');