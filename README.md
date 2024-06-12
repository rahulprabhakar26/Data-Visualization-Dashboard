# Data Visualization Dashboard

This project is a Data Visualization Dashboard built using Java (Spring Boot) as the backend and React.js with D3.js for the frontend. The dashboard reads data from a MySQL database, provides filtering options, and visualizes the data with interactive charts.

## Table of Contents

- [Data Visualization Dashboard](#data-visualization-dashboard)
  - [Table of Contents](#table-of-contents)
  - [Project Structure](#project-structure)
  - [Technologies Used](#technologies-used)
  - [Features](#features)
  - [Setup Instructions](#setup-instructions)
    - [Backend Setup](#backend-setup)
    - [Frontend Setup](#frontend-setup)
  - [API Endpoints](#api-endpoints)
  - [Screenshots](#screenshots)
  - [Contributing](#contributing)
  - [License](#license)

## Project Structure

data_vis_dashboard/
│
├── backend/
│ ├── src/
│ │ └── main/
│ │ └── java/
│ │ └── com/
│ │ └── example/
│ │ └── dashboard/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ └── service/
│ └── resources/
│ ├── application.properties
│ └── data.sql
│
├── frontend/
│ ├── public/
│ └── src/
│ ├── components/
│ ├── App.js
│ ├── index.js
│ ├── Dashboard.js
| ├── Chart.js
│ └── styles.css
└── README.md


## Technologies Used

- **Backend**: Java, Spring Boot, MySQL
- **Frontend**: React.js, D3.js, Axios

## Features

- Interactive data visualizations using D3.js
- Filter options for various data parameters
- Data fetched from a MySQL database through a Spring Boot backend

## Setup Instructions

### Backend Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/data_vis_dashboard.git
    cd data_vis_dashboard/backend
    ```

2. **Setup MySQL Database**:
    - Create a database named `dashboard`.
    - Configure your `application.properties` with your MySQL credentials.

    **src/main/resources/application.properties**
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/dashboard
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Import Data**:
    - Ensure your `data.sql` file in `src/main/resources` contains the initial data.

4. **Run the Spring Boot Application**:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup

1. **Navigate to the frontend directory**:
    ```bash
    cd ../frontend
    ```

2. **Install dependencies**:
    ```bash
    npm install
    ```

3. **Start the React application**:
    ```bash
    npm start
    ```

4. **Verify**: Open `http://localhost:3000` in your browser to view the dashboard.

## API Endpoints

- **GET** `/api/data`: Fetches all data
- **GET** `/api/data/filter`: Fetches filtered data based on query parameters

Example:
```bash
curl -X GET "http://localhost:8080/api/data/filter?endYear=2020&topic=pharmaceutical"


