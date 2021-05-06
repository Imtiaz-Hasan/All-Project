-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 15, 2019 at 03:07 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `k02`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookid` varchar(5) NOT NULL,
  `bookname` varchar(100) NOT NULL,
  `authorname` varchar(100) NOT NULL,
  `edition` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookid`, `bookname`, `authorname`, `edition`) VALUES
('B001', 'Principles of Economics', 'N. Gregory Mankiw', '5th'),
('B002', 'Let Us C', 'Yashavant Kanetkar ', '7th'),
('B003', 'A Tour of C++', 'Bajarne Stroustrup', '4th'),
('B004', 'Introduction to Algorithm', 'Thomas H. Cormen', '3rd'),
('B005', 'Fundamentals of Database System', 'Ramez Elmasri', '7th'),
('B006', 'Accounting Principles ', 'Jerry J. Weygandt ', '13th'),
('B007', 'Statistics for Dummies', 'Deborah Rumsey', '2nd'),
('B008', 'Data Structures Using C', 'Reema Thareja', '2nd'),
('B009', 'Java: A Beginner\'s Guide', 'Herbert Schildt', '8th'),
('B010', 'Data Structure & Algorithm in Java', 'Adam Drozdek', '6th'),
('B011', 'Think Python: An Introduction to Software Design', 'Allen B. Downey ', '3rd'),
('B012', 'Hello, Android: Introducing Google\'s Mobile Development Platform', 'Ed Burnette', '5th'),
('B013', 'Operating System Concepts', 'Avi Silberschatz', '10th'),
('B014', 'Linux Kernel Development', 'Robert Love', '4th'),
('B015', 'Introduction to Finance: Markets, Investments, and Financial Management', 'onald Melicher', '16th'),
('B016', 'Data Mining: Concepts and Techniques', 'Jiawei Han', '3rd'),
('B017', 'Hacking: The Art of Exploitation', 'Jon Erickson', '2nd'),
('B018', 'Computer Engineering: Hardware Design', 'M. Morris Mano', '4th'),
('B019', 'Design Patterns: Elements of Reusable Object-Oriented Software', 'Erich Gramma', '5th');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userid` varchar(10) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userid`, `password`) VALUES
('a1', '123'),
('b1', '123');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentname` varchar(50) DEFAULT NULL,
  `libraryid` varchar(5) NOT NULL,
  `bookid` varchar(10) DEFAULT '-'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentname`, `libraryid`, `bookid`) VALUES
('mutasim', '24', '15'),
('hii', 'S042', '1'),
('superman', 'st1', '2'),
('Thor', 'st2', '3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bookid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`libraryid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
