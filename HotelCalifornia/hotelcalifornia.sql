-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-11-2023 a las 20:53:22
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelcalifornia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idTipoHab` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `idImagen` int(11) NOT NULL,
  `reserva` tinyint(1) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipoHab`, `piso`, `idImagen`, `reserva`, `estado`) VALUES
(101, 1, 1, 1, 0, 1),
(102, 12, 1, 16, 0, 1),
(103, 2, 1, 3, 0, 1),
(104, 32, 1, 20, 0, 1),
(105, 22, 1, 19, 0, 1),
(106, 32, 1, 20, 0, 1),
(107, 3, 1, 17, 0, 1),
(108, 13, 1, 18, 0, 1),
(201, 1, 2, 1, 0, 1),
(202, 11, 2, 2, 0, 1),
(203, 3, 2, 17, 0, 1),
(204, 32, 2, 20, 0, 1),
(205, 22, 2, 19, 0, 1),
(206, 32, 2, 20, 0, 1),
(207, 2, 2, 3, 1, 1),
(208, 32, 2, 20, 0, 1),
(301, 22, 3, 19, 0, 1),
(302, 32, 3, 20, 0, 1),
(303, 11, 3, 2, 0, 1),
(304, 102, 3, 21, 0, 1),
(305, 32, 3, 20, 0, 1),
(306, 102, 3, 21, 0, 1),
(307, 22, 3, 19, 0, 1),
(308, 102, 3, 21, 0, 1),
(309, 32, 3, 20, 0, 1),
(310, 102, 3, 21, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `dni` int(11) NOT NULL,
  `Domicilio` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `pais` varchar(60) NOT NULL,
  `Provincia` varchar(20) NOT NULL,
  `Localidad` varchar(20) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `Celular` int(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `dni`, `Domicilio`, `fechaNacimiento`, `pais`, `Provincia`, `Localidad`, `Correo`, `password`, `Celular`, `estado`) VALUES
(1, 'Damian Emiliano', 'Martinez', 36123456, 'Lacara 456', '1990-01-01', 'Argentina', 'Buenos Aires', 'Mar del Plata', 'dibumartinez@gmail.com', 'miraquetecomo', 2147483647, 1),
(2, 'Franco', 'Armani', 37321654, 'Sarmiento 789', '1990-01-01', 'Argentina', 'Santa Fe', 'Casilda', 'francoarmani@gmail.com', 'vamodibu', 2147483647, 1),
(3, 'Nicolas Hernan', 'Otamendi', 36524588, 'Mitre 854', '1990-01-01', 'Argentina', 'Buenos Aires', 'Gral Pacheco', 'nicootamendi@gmail.com', 'elhacha', 2147483647, 1),
(4, 'Julian', 'Alvarez', 42123456, 'Manchester 2340', '1990-01-01', 'Argentina', 'Cordoba', 'Calchin', 'araña@gmail.com', 'hallandpete', 2147483647, 1),
(5, 'Enzo', 'Fernandez', 43202029, 'Londres 674', '1990-01-01', 'Argentina', 'Buenos Aires', 'San Martin', 'enzof@gmail.com', 'entredepedo', 2147483647, 1),
(6, 'Nicolas', 'Tagliafico', 40965874, 'Misiones 898', '1990-01-01', 'Argentina', 'Buenos Aires', 'Rafael Calzada', 'nicotagliafico@gmail.com', 'samurai', 2147483647, 1),
(7, 'Leandro Daniel', 'Paredes Benitez', 42874447, 'Castañares 152', '1990-01-01', 'Argentina', 'Buenos Aires', 'San Justo', 'LeanParedes@gmail.com', 'vangaalchupala', 2147483647, 1),
(8, 'Lautaro', 'Martinez', 34887554, 'Pugliese 2587', '1990-01-01', 'Argentina', 'Buenos Aires', 'Bahia Blanca', 'lautymartinez@gmail.com', 'eltoro', 2147483647, 1),
(9, 'Angel', 'Di Maria', 32357951, 'Carlos Casares 1945', '1990-01-01', 'Argentina', 'Santa Fe', 'Rosario', 'cabellodeangel@gmail.com', 'fideo11', 2147483647, 1),
(10, 'Lionel', 'Messi', 32654456, 'Las Lilas 1010', '1987-06-24', 'Argentina', 'Santa Fe', 'Rosario', 'elmessias10@gmail.com', 'andapaallabobo', 2147483647, 1),
(14, 'Huesped', 'Prueba', 2000000, 'Calle X', '1990-01-01', 'Argentina', 'Misiones', 'Posadas', 'correo@gmail.com', 'pass', 20202020, 1),
(16, 'Huesped de prueba', 'Prueba aa', 9870, 'Calle XYZ', '1990-01-01', 'Argentina', 'Misiones', 'Posadas', 'h@', 'h', 20202020, 1),
(18, 'Huesped de prueba', 'Prueba aa', 98709, 'Calle XYZ', '1990-01-01', 'Argentina', 'Misiones', 'Posadas', 'hh@', 'h', 20202020, 1),
(19, 'aaaaaaa', '', 32432423, 'aaaaaaa', '2000-01-01', '', '', '', 'aaaa@', 'a', 1214142, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagen`
--

CREATE TABLE `imagen` (
  `idImagen` int(11) NOT NULL,
  `ruta` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `imagen`
--

INSERT INTO `imagen` (`idImagen`, `ruta`) VALUES
(3, '/imagenes/habitaciones/doble_comun.jpg'),
(16, '/imagenes/habitaciones/doble_plus.jpg'),
(1, '/imagenes/habitaciones/indi_comun.png'),
(2, '/imagenes/habitaciones/indi_plus.png'),
(21, '/imagenes/habitaciones/King_VIP.jpg'),
(19, '/imagenes/habitaciones/matri_comun.jpg'),
(20, '/imagenes/habitaciones/matri_plus.png'),
(17, '/imagenes/habitaciones/triple_comun.jpg'),
(18, '/imagenes/habitaciones/triple_plus.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `idPersonal` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `celular` int(15) NOT NULL,
  `username` varchar(60) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `admin` tinyint(1) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`idPersonal`, `nombre`, `apellido`, `dni`, `domicilio`, `celular`, `username`, `correo`, `password`, `fechaNacimiento`, `admin`, `estado`) VALUES
(1, 'Admin', 'Master', 888444, 'Argentina 2023', 445, 'Admin', 'admin@gmail.com', 'admin', '1983-10-04', 1, 1),
(2, 'Recepcionista', 'Chepibe', 11111111, 'Corrientes 123', 0, 'Recep', 'recep@gmail.com', 'recep', '1985-09-18', 0, 1),
(3, 'Empleado', 'Esclavito', 349, 'No tiene casa', 2349230, 'esclavito', 'esclavito@gmail.com', '00', '1999-10-03', 0, 1),
(5, 'Prueba', 'P', 23428, 'lalala 0', 21314, 'prueba', 'prueba@gmail.com', '2309', '1995-10-08', 1, 0),
(6, '6', '6', 66, '6', 6, '6', '6', '6', '2023-10-01', 0, 0),
(8, 'a', 'asd', 324, 'asd', 123, 'asd', 'asdasdasd@gmail.com', '***asd', '2023-10-05', 0, 1),
(9, 'Simba', 'Leon', 90876, 'La selva 234', 56789, 'reyleon', 'reyleon@gmail.com', 'hakunamatata', '1992-10-03', 0, 1),
(10, 'a', 'r', 444, 'asdads', 7777, 'a', 'asd@', 'a', '1991-10-06', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `fechaCheckIn` date NOT NULL,
  `fechaCheckOut` date NOT NULL,
  `cantPersonas` int(11) NOT NULL,
  `precioFinal` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHuesped`, `idHabitacion`, `fechaCheckIn`, `fechaCheckOut`, `cantPersonas`, `precioFinal`, `estado`) VALUES
(36, 4, 101, '2023-10-27', '2023-10-28', 1, 90, 0),
(37, 4, 101, '2023-10-29', '2023-10-30', 1, 90, 0),
(39, 10, 304, '2023-10-28', '2023-10-30', 1, 300, 0),
(40, 3, 303, '2023-10-28', '2023-10-30', 1, 110, 0),
(41, 5, 207, '2023-11-01', '2023-11-03', 1, 160, 1),
(42, 16, 205, '2023-10-29', '2023-10-28', 2, 315, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `idTipoHab` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `cantPersonas` tinyint(4) NOT NULL,
  `cantCamas` tinyint(4) NOT NULL,
  `tipoCamas` varchar(20) NOT NULL,
  `precioxNoche` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipohabitacion`
--

INSERT INTO `tipohabitacion` (`idTipoHab`, `nombre`, `cantPersonas`, `cantCamas`, `tipoCamas`, `precioxNoche`, `estado`) VALUES
(1, 'Individual', 1, 1, 'Individual', 45, 1),
(2, 'Doble Individual', 2, 2, 'Individual', 80, 1),
(3, 'Triple Individual', 3, 3, 'Individual', 110, 1),
(11, 'Individual Plus', 1, 1, 'IndividualPlus', 55, 1),
(12, 'Doble Individual Plus', 2, 2, 'IndividualPlus', 95, 1),
(13, 'Triple Individual Plus', 3, 3, 'IndividualPlus', 125, 1),
(22, 'Matrimonial', 2, 1, 'Queen', 70, 1),
(32, 'Matrimonial Plus', 2, 1, 'Queen', 85, 1),
(102, 'Suite VIP', 2, 1, 'King', 150, 1),
(123, '123', 123, 127, '123', 123, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipoHab` (`idTipoHab`),
  ADD KEY `idImagen` (`idImagen`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `Correo` (`Correo`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `imagen`
--
ALTER TABLE `imagen`
  ADD PRIMARY KEY (`idImagen`),
  ADD UNIQUE KEY `ruta` (`ruta`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`idPersonal`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `correo` (`correo`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`idTipoHab`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `imagen`
--
ALTER TABLE `imagen`
  MODIFY `idImagen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `idPersonal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipoHab`) REFERENCES `tipohabitacion` (`idTipoHab`),
  ADD CONSTRAINT `habitacion_ibfk_2` FOREIGN KEY (`idImagen`) REFERENCES `imagen` (`idImagen`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
