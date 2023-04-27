-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2023 at 10:05 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lmsjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_login`
--

CREATE TABLE `student_login` (
  `username` text DEFAULT NULL,
  `passwords` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_login`
--

INSERT INTO `student_login` (`username`, `passwords`) VALUES
('2323', '1111'),
('11111', '1234'),
('shiva', '1232'),
('harsha', '1234'),
('hari', '1234'),
('hemanth', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_attendance_report`
--

CREATE TABLE `teacher_attendance_report` (
  `student_name` varchar(1000) DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher_attendance_report`
--

INSERT INTO `teacher_attendance_report` (`student_name`, `days`, `id`) VALUES
('hari', 1, 1),
('shiva', 1, 2),
('sanju', 47, 3),
(NULL, NULL, NULL),
(NULL, NULL, NULL),
(NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `teacher_login`
--

CREATE TABLE `teacher_login` (
  `username` text DEFAULT NULL,
  `passwords` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher_login`
--

INSERT INTO `teacher_login` (`username`, `passwords`) VALUES
('hari', '6699');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
