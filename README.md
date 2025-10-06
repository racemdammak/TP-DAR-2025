# 🧠 TP1 – Développement d’Applications Réparties (DAR)

**Projet :** Communication Client-Serveur en Java  
**Étudiant :** Racem Dammak  
**Classe :** LSI 3  - 3.2

---

## 🎯 Objectif

Mettre en place une **communication entre un client et un serveur** en utilisant des **sockets TCP en Java**, afin de comprendre les principes de base des applications réparties et du modèle client-serveur.

---

## ⚙️ Fonctionnement du serveur

Le serveur écoute sur un port spécifique et attend la connexion d’un client.  
Dès qu’un client se connecte, il reçoit un message, l’affiche, et renvoie une réponse.

### Exemple de sortie console :
Je suis un serveur en attente la connexion d'un client
un client est connecté
Reçu du client: Bonjour serveur!
Fermeture de la connexion.

---

## 💻 Fonctionnement du client

Le client se connecte au serveur via son adresse (`localhost` ou adresse IP), envoie un message texte, puis affiche la réponse reçue.

### Exemple de sortie console :
Je suis un client pas encore connecté…
je suis un client connecté
Réponse du serveur: Message reçu: Bonjour serveur!
Fermeture de la connexion côté client.

---

## 🚀 Exécution dans l’IDE

1. **Ouvre le projet** dans ton IDE (Eclipse ou IntelliJ).  
2. Exécute d’abord `Server.java`  
   → Le serveur affiche *“en attente de connexion”*  
3. Exécute ensuite `Client.java`  
   → Le client se connecte et envoie le message.  
4. Observe les échanges dans les deux consoles.

💡 *Les deux classes peuvent être lancées dans deux consoles différentes de l’IDE.*

---

## 🌐 Connexion via une adresse IP

Si le serveur et le client sont sur **deux machines différentes** :

1. Remplace dans `Client.java` :
   ```java
   "localhost";
par
String host = "192.168.X.X"; // adresse IP du serveur
Vérifie l’adresse IP du serveur :

Windows : ipconfig

Linux/macOS : ifconfig ou ip a

Assure-toi que le pare-feu autorise le port utilisé (par défaut 5000).

## 🧠 Résumé
Serveur : attend la connexion d’un client.

Client : initie la connexion, envoie un message et reçoit une réponse.

Communication : réalisée via les sockets TCP.

## 🧾 Auteur
Racem Dammak
Étudiant en 3ᵉ année LSI
