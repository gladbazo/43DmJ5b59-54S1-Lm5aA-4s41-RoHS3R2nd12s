# 43DmJ5b59-54S1-Lm5aA-4s41-RoHS3R2nd12s
micro-service gas station
The micro-service uses H2 database it takes data from the given .json link.
## Prerequisites

- Java 11 or higher
- Maven
- Git

## Build

1. Clone the repository:

    ```bash
    git clone https://github.com/gladbazo/43DmJ5b59-54S1-Lm5aA-4s41-RoHS3R2nd12s.git
    ```

2. Navigate to the project directory:

    ```bash
    cd 43DmJ5b59-54S1-Lm5aA-4s41-RoHS3R2nd12s
    ```

3. Build the project using Maven:

    ```bash
    mvn clean package
    ```

## Start the Service

1. After building the project, navigate to the target directory:

    ```bash
    cd target
    ```

2. Run the JAR file:

    ```bash
    java -jar 43DmJ5b59-54S1-Lm5aA-4s41-RoHS3R2nd12s.jar
    ```
Use Application.java to start it.
Once the service is running, you can access it using the following endpoints:

- **Open Gas Stations**: `http://localhost:8080/gas-stations/open`
- **Gas Station by Name**: `http://localhost:8080/gas-stations/{name}` (example: http://localhost:8080/gas-stations/TotalEnergies%20Berlin )
- **Fuel Price Statistics**: `http://localhost:8080/gas-stations/prices/{fuelType}` (example: http://localhost:8080/gas-stations/prices/e5 )

Replace `{name}` and `{fuelType}` with the desired parameters.
