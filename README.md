# Activité Pratique N°1 : Injection de Dépendances et Couplage Faible

Ce dépôt contient le travail réalisé pour l'**activité pratique N°1**.  
L'objectif est de mettre en œuvre le principe d'**Inversion de Contrôle (IoC)** à travers l'**Injection de Dépendances** pour créer des applications avec un **couplage faible**, les rendant ainsi plus flexibles et maintenables.

---

## 🎯 Objectifs du TP

- Comprendre la différence entre **couplage fort** et **couplage faible**.  
- Mettre en place l'**Injection de Dépendances (DI)** de différentes manières :  
  - Par **instanciation statique**  
  - Par **instanciation dynamique (réflexion Java)**  
  - Par un **framework IoC (Spring)**  

---

## 📂 Structure du Projet

- **dao**  
  - `IDao` : Interface définissant la méthode `getData()`  
  - `DaoImpl` : Implémentation concrète simulant la récupération de données  

- **metier**  
  - `IMetier` : Interface définissant la méthode `calcul()`  
  - `MetierImpl` : Implémentation qui dépend de `IDao` mais en couplage faible (via injection)  

- **présentations (tests)**  
  - `Presentation1` : Injection par instanciation **statique**  
  - `Presentation2` : Injection par instanciation **dynamique** (fichier config + `Class.forName`)  
  - `PresentationSpringXML` : (prévu, pas encore implémenté)  
  - `PresentationSpringAnnotations` : (prévu, pas encore implémenté)  

---

## 🛠️ Étapes Réalisées

### 1. Création de l'interface `IDao`
```java
public interface IDao {
    double getData();
}
``
