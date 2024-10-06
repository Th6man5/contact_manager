/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Raihan
 * Created: 5 Oct 2024
 */

CREATE TABLE contact (
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    phone_numb VARCHAR(255) NOT NULL,
    email VARCHAR(255) DEFAULT NULL,
    job_title VARCHAR(255) DEFAULT NULL,
    company VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (id)
);

INSERT INTO contact (name, phone_numb, email, job_title, company) VALUES
('John Doe', '123-456-7890', 'johndoe@example.com', 'Manager', 'TechCorp'),
('Jane Smith', '987-654-3210', 'janesmith@example.com', 'Developer', 'InnovateX'),
('David Brown', '333-333-3333', 'davidb@example.com', 'Consultant', 'ConsultPro');