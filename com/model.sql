CREATE TABLE address (
	address_id SERIAL PRIMARY KEY,
	city TEXT NOT NULL,
	postal_code TEXT NOT NULL,
	street TEXT NOT NULL
)

CREATE TABLE book (
	book_id SERIAL PRIMARY KEY,
	isbn TEXT NOT NULL,
    title TEXT NOT NULL,
    author TEXT,
    genres TEXT,
    issue_date DATE,
    rental_date DATE,
    state INT
)


CREATE TABLE person (
	person_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    mother_name TEXT NOT NULL,
    birth_day DATE NOT NULL,
    phone_number TEXT,
    address_id INT,
    membership_date DATE,
    debit DOUBLE PRECISION,
	 CONSTRAINT fk_address
      FOREIGN KEY(address_id) 
	  REFERENCES address(address_id)
)
DROP TABLE person_book;

CREATE TABLE person_book (
	person_id INT NOT NULL,
	book_id INT NOT NULL,
	CONSTRAINT fk_person
      FOREIGN KEY(person_id) 
	  REFERENCES person(person_id),
	CONSTRAINT fk_book
      FOREIGN KEY(book_id) 
	  REFERENCES book(book_id),
	PRIMARY KEY(person_id,book_id)
)