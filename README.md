# Annakshetra 🍲 (Food Redistribution Platform)

Annakshetra is a full-stack platform designed to connect **food donors, NGOs, volunteers, and recipients** to enable **real-time leftover meal redistribution**. The platform aims to reduce food waste and streamline NGO coordination through a modern, scalable software solution.

The system is built with a **Spring Boot backend** exposing **JWT-secured REST APIs** and a **React.js frontend** providing role-based dashboards for donors, volunteers, and coordinators. Cloud deployment is being designed as a future step using a cloud-native architecture.

---

## ✨ Key Features

- Role-based flow connecting:
  - **Donors** (post leftover meals)
  - **NGOs/Coordinators** (manage and route requests)
  - **Volunteers** (pickup routing and delivery support)
  - **Recipients** (request meals)
- Secure authentication + authorization using **JWT**
- REST API services for:
  - Donor registration
  - Meal posting
  - Request handling and coordination
  - Volunteer routing workflow
- React dashboards designed for each role
- Emphasis on clean architecture, scalability, and API performance

---

## 🧱 Tech Stack

### Frontend
- React.js
- Role-based dashboards (Donor / Volunteer / Coordinator)
- UI for meal posting, request tracking, and volunteer assignment

### Backend
- Java + Spring Boot
- JWT-secured REST APIs
- Service modules for donor registration, routing logic, meal posting, and request handling

---

## 📌 Planned Cloud Deployment (In Progress)

Annakshetra is being designed to support scalable deployment in the future:

- AWS EKS (Kubernetes) for container orchestration
- Terraform for repeatable infrastructure provisioning
- Kubernetes manifests for automated rollout and load-balanced services

> Note: Cloud deployment is **not implemented yet** — infrastructure design and planning is currently in progress.

---

## 📂 Project Structure (Example)

> Adjust this to match your repository.

