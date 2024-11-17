
https://github.com/user-attachments/assets/ebd12c0d-aa85-40c3-b9c5-2d7997f78e29
Voici un exemple de fichier `README.md` simple et professionnel, adapté à votre projet de Spring Boot avec un REST Controller, incluant la mention d'une vidéo démonstrative à venir :

---

```markdown
# Spring Boot REST Controller Demo

Ce projet est une application Spring Boot démontrant la création d'une API REST simple pour la gestion des comptes (CRUD). Il utilise Spring Boot 3.3.5 et Java 21.

## Fonctionnalités

- **API REST** pour les opérations CRUD sur les entités `Compte`.
- Gestion des types de comptes via une énumération (`TypeCompte`).
- Base de données embarquée H2 pour le stockage des données.
- Architecture MVC avec des couches distinctes (Controller, Service, Repository).
- Intégration facile grâce à Spring Boot et Spring Data JPA.

---

## Prérequis

- **Java 21** ou une version plus récente.
- **Maven 3.8+** pour la gestion des dépendances.
- Un IDE (comme IntelliJ IDEA ou Eclipse) ou un éditeur de texte compatible avec Spring Boot.

---

## Installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/votre-utilisateur/votre-projet.git
   cd votre-projet
   ```

2. Compilez et lancez l'application avec Maven :
   ```bash
   mvn spring-boot:run
   ```

3. Accédez à l'API via [http://localhost:8082](http://localhost:8082).

---

## Endpoints de l'API

| Méthode | URL                     | Description                        |
|---------|-------------------------|------------------------------------|
| GET     | `/api/comptes`          | Récupérer tous les comptes.        |
| GET     | `/api/comptes/{id}`     | Récupérer un compte par ID.        |
| POST    | `/api/comptes`          | Créer un nouveau compte.           |
| PUT     | `/api/comptes/{id}`     | Mettre à jour un compte existant.  |
| DELETE  | `/api/comptes/{id}`     | Supprimer un compte par ID.        |

---

## Structure du projet

- **`entities`** : Contient les entités JPA (`Compte`, `TypeCompte`).
- **`repositories`** : Gère l'accès aux données (interface `JpaRepository`).
- **`controllers`** : Fournit les endpoints REST.

---

## Vidéo Démonstrative

Voici une vidéo démontrant les fonctionnalités de l'application 🎥


https://github.com/user-attachments/assets/4c6a3e5f-699b-456e-80a0-27d35cae300b


---


