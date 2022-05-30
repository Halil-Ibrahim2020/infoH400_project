-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 30 mai 2022 à 23:13
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projet_h400`
--

-- --------------------------------------------------------

--
-- Structure de la table `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `id_teacher` int(11) DEFAULT NULL,
  `creator` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `courses`
--

INSERT INTO `courses` (`id`, `name`, `created_at`, `updated_at`, `id_teacher`, `creator`) VALUES
(5, 'histology', '2022-05-02 14:32:50', '2022-05-02 14:32:50', NULL, 'yassen'),
(8, 'medical imaging', '2022-05-02 15:18:55', '2022-05-02 15:18:55', 7, 'yassen');

-- --------------------------------------------------------

--
-- Structure de la table `course_histology`
--

CREATE TABLE `course_histology` (
  `id_course_histo` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `course_histology`
--

INSERT INTO `course_histology` (`id_course_histo`, `name`, `login`) VALUES
(1, 'pierre olivier', 'hahaha'),
(2, 'Halil', 'hihihi'),
(3, 'yassen', 'huhuhu'),
(4, 'halicela', 'halilibo'),
(5, 'zzzz', 'goku'),
(6, 'gohan', 'gohan'),
(7, 'selma', 'selma1'),
(8, 'abi', 'shqip'),
(9, 'abi', 'shqip'),
(10, 'abi', 'shqip'),
(11, 'Kawthar', 'HabibtI'),
(12, 'maxime', 'max'),
(13, 'maxime', 'max'),
(14, 'maxime', 'max'),
(15, 'ibrahim', 'ibra'),
(16, 'ibrahim', 'trunks'),
(17, 'ibrahim', 'vegeta');

-- --------------------------------------------------------

--
-- Structure de la table `course_med`
--

CREATE TABLE `course_med` (
  `id_course_med` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `login` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `course_med`
--

INSERT INTO `course_med` (`id_course_med`, `name`, `login`) VALUES
(1, 'pierre olivier ', 'hahaha'),
(2, 'Halil', 'hihihi'),
(3, 'yassen', 'huhuhu'),
(4, 'gohan', 'gohan'),
(5, 'selma', 'selma1'),
(6, 'abi', 'shqip'),
(7, 'abi', 'shqip'),
(8, 'abi', 'shqip'),
(9, 'Kawthar', 'HabibtI'),
(10, 'maxime', 'max'),
(11, 'ibrahim', 'ibra'),
(12, 'ibrahim', 'trunks'),
(13, 'ibrahim', 'vegeta');

-- --------------------------------------------------------

--
-- Structure de la table `learner`
--

CREATE TABLE `learner` (
  `id` int(11) NOT NULL,
  `id_person` int(11) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `registration_time` datetime DEFAULT NULL,
  `level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `learner`
--

INSERT INTO `learner` (`id`, `id_person`, `Name`, `registration_time`, `level`) VALUES
(1, 1, 'Pierre Olivier', '2022-04-25 12:12:39', 'A');

-- --------------------------------------------------------

--
-- Structure de la table `loginlist`
--

CREATE TABLE `loginlist` (
  `id_login` int(11) NOT NULL,
  `id_person1` int(11) DEFAULT NULL,
  `login` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `loginlist`
--

INSERT INTO `loginlist` (`id_login`, `id_person1`, `login`) VALUES
(1, 1, 'hahaha'),
(2, 2, 'hihihi'),
(3, 3, 'huhuhu'),
(4, NULL, 'ibo'),
(5, NULL, 'halilibo'),
(6, NULL, 'goku'),
(7, NULL, 'gohan'),
(8, NULL, 'selma1'),
(9, NULL, 'shqip'),
(10, NULL, 'Habibti'),
(12, NULL, 'max'),
(13, NULL, 'ibra'),
(14, NULL, 'trunks'),
(15, NULL, 'vegeta');

-- --------------------------------------------------------

--
-- Structure de la table `person`
--

CREATE TABLE `person` (
  `id_person` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `password` varchar(255) NOT NULL,
  `Login` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `person`
--

INSERT INTO `person` (`id_person`, `Name`, `DateOfBirth`, `password`, `Login`) VALUES
(1, 'Pierre Olivier', '2000-10-09', 'ohohoh', 'hahaha'),
(2, 'Halil', '2000-10-08', 'hihi', 'hihihi'),
(3, 'yassen', '2000-10-08', 'hihi', 'huhuhu'),
(4, 'halilcela', '1999-10-10', 'hic', 'ibo'),
(5, 'halicela', '1999-10-10', 'hic1739*', 'halilibo'),
(6, 'zzzz', '1999-10-10', 'goku1', 'goku'),
(7, 'gohan', '1999-10-10', 'gohan1', 'gohan'),
(8, 'selma', '1999-10-10', 'selma2', 'selma1'),
(9, 'abi', '1984-06-24', 'prout', 'shqip'),
(10, 'Kawthar', '2002-11-10', 'laplusbellefemmedumonde', 'Habibti'),
(11, 'maxime', '1999-10-15', 'max1510', 'max'),
(12, 'ibrahim', '1999-10-15', 'ibra1510', 'ibra'),
(13, 'ibrahim', '1999-10-15', 'trunks1510', 'trunks'),
(14, 'ibrahim', '1999-10-15', 'vegeta10', 'vegeta');

-- --------------------------------------------------------

--
-- Structure de la table `teachers`
--

CREATE TABLE `teachers` (
  `id` int(11) NOT NULL,
  `id_person` int(11) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  `registration_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `teachers`
--

INSERT INTO `teachers` (`id`, `id_person`, `Name`, `profession`, `registration_time`) VALUES
(6, 3, 'yassen', 'Professor histology', '2022-05-02 15:02:41'),
(7, 3, 'yassen', 'Professor histology', '2022-05-02 15:02:41');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Courses_fk0` (`id_teacher`);

--
-- Index pour la table `course_histology`
--
ALTER TABLE `course_histology`
  ADD PRIMARY KEY (`id_course_histo`),
  ADD KEY `login` (`login`);

--
-- Index pour la table `course_med`
--
ALTER TABLE `course_med`
  ADD PRIMARY KEY (`id_course_med`),
  ADD KEY `login` (`login`);

--
-- Index pour la table `learner`
--
ALTER TABLE `learner`
  ADD PRIMARY KEY (`id`),
  ADD KEY `learner_fk0` (`id_person`);

--
-- Index pour la table `loginlist`
--
ALTER TABLE `loginlist`
  ADD PRIMARY KEY (`id_login`),
  ADD UNIQUE KEY `login` (`login`),
  ADD KEY `id_person1` (`id_person1`);

--
-- Index pour la table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id_person`),
  ADD KEY `Login` (`Login`);

--
-- Index pour la table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `teachers_fk0` (`id_person`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `course_histology`
--
ALTER TABLE `course_histology`
  MODIFY `id_course_histo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT pour la table `course_med`
--
ALTER TABLE `course_med`
  MODIFY `id_course_med` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `learner`
--
ALTER TABLE `learner`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `loginlist`
--
ALTER TABLE `loginlist`
  MODIFY `id_login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT pour la table `person`
--
ALTER TABLE `person`
  MODIFY `id_person` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `Courses_fk0` FOREIGN KEY (`id_teacher`) REFERENCES `teachers` (`id`);

--
-- Contraintes pour la table `course_med`
--
ALTER TABLE `course_med`
  ADD CONSTRAINT `course_med_ibfk_1` FOREIGN KEY (`login`) REFERENCES `loginlist` (`login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `learner`
--
ALTER TABLE `learner`
  ADD CONSTRAINT `learner_fk0` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`);

--
-- Contraintes pour la table `loginlist`
--
ALTER TABLE `loginlist`
  ADD CONSTRAINT `loginlist_ibfk_1` FOREIGN KEY (`id_person1`) REFERENCES `person` (`id_person`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `person_ibfk_1` FOREIGN KEY (`Login`) REFERENCES `loginlist` (`login`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `teachers`
--
ALTER TABLE `teachers`
  ADD CONSTRAINT `teachers_fk0` FOREIGN KEY (`id_person`) REFERENCES `person` (`id_person`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
