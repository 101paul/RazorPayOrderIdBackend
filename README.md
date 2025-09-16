# RazorPay Order ID Backend 💳⚡

This is a **Spring Boot backend service** that integrates with **Razorpay Payment Gateway** to generate **unique Order IDs** whenever a new order is placed.  
It is designed to work seamlessly with my shopping application **[ShopEase](https://github.com/101paul/ShopEase_frBuyer)** 🛒.

---

## 🚀 Features
- ✅ Create new Razorpay Orders with unique **Order IDs**  
- ✅ Configurable order details (amount, currency, receipt)  
- ✅ Secure integration with Razorpay using API keys  
- ✅ REST API endpoint to be consumed by Android app / frontend  
- ✅ Cross-Origin enabled (CORS) for external clients  

---

## 📦 Tech Stack
- **Java 21**  
- **Spring Boot** (REST API)  
- **Razorpay Java SDK** (`com.razorpay:razorpay-java:1.4.5`)  
- **Gradle** (build tool)  

---

🔐 Security

API keys (razorpay.key_id, razorpay.key_secret) are stored in application.properties

This file is excluded from GitHub via .gitignore to keep secrets safe
