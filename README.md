# Deploying Dockerized Applications on IBM Cloud Kubernetes with Container Registry

## Prepared by Divya Murugan

### Accessing IBM Cloud Container Registry

1. **Log in to IBM Cloud Dashboard:**
   - Visit the [IBM Cloud Dashboard](https://cloud.ibm.com/) and log in with your IBM Cloud credentials.

2. **Navigate to Container Registry:**
   - In the IBM Cloud Dashboard, click on the **Menu** (three horizontal lines in the top-left corner).
   - Under the "Catalog" section, search for **Container Registry**.
   - Click on **Container Registry** in the results.

### Creating a Namespace in IBM Cloud Container Registry

1. **Go to "Namespaces":**
   - In the IBM Cloud Container Registry dashboard, click the **Namespaces** tab to manage your namespaces.

2. **Create a Namespace:**
   - Click **Create Namespace**.
   - Enter a name for your namespace (it should follow the rules mentioned earlier, e.g., lowercase letters, numbers, and hyphens).
   - Click **Create** to create your namespace.

#### Example Valid Namespace Names:
- my-container
- dev-apps
- project-registry
- cloud-namespace01
- web-images

Once your namespace is created, you can start using it to organize your container images within the IBM Cloud Container Registry.

### Step 1: Log in to IBM Cloud

1. **Log in using your API key:**
   If you haven't logged in yet, use the following command. Replace `<your-api-key>` with your actual IBM Cloud API key:

   ```bash
   ibmcloud login --apikey <your-api-key>
