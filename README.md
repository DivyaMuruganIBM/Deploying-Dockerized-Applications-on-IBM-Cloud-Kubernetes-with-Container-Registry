# Deploying Dockerized Applications on IBM Cloud Kubernetes  

This project demonstrates how to deploy Dockerized applications on IBM Cloud Kubernetes using IBM Cloud Container Registry. The setup includes building, pushing, and deploying Docker images for frontend and backend services.  

## Overview  

- **Container Registry**: Used to store and manage container images.  
- **Kubernetes**: Orchestrates and deploys the services in a cluster environment.  
- **Frontend and Backend Services**: Both services are built as Docker images and deployed as Kubernetes deployments.  

## Key Steps  

### 1. Access IBM Cloud Container Registry  
- Log in to IBM Cloud.  
- Navigate to Container Registry in the IBM Cloud Dashboard.  
- Create a namespace to organize container images.  

### 2. Build and Push Docker Images  
- Build Docker images for frontend and backend services.  
- Push the images to IBM Cloud Container Registry.  

### 3. Deploy to Kubernetes  
- Use Kubernetes `kubectl` commands to deploy services.  
- Ensure `imagePullSecrets` are configured for private registries.  

### 4. Verify and Access Services  
- Check the status of deployments, pods, and services using `kubectl`.  
- Access the services through exposed NodePorts or LoadBalancer IPs.  

## Summary of Commands  

### IBM Cloud Commands  
- Log in to IBM Cloud:  
  ```bash
  ibmcloud login --apikey <your-api-key>
