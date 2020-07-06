# Autonomous Database with Spring Boot

Oracle Autonomous Database make you use a wallet to establish a secure connection. Wallet contains all the cryptographic material to authenticate and encrypt your queries.

This is an example of how to configure it in Spring Boot.

Requirements:

Export the following environment variables:
- **TNS_ADMIN**=/Path/to/your/wallet
- **DB_SERVICE**=<db_service_name>
- **DB_USER**=<your_db_user>
- **DB_PASSWORD**=<your_db_password>

This code was tested with:

Oracle Autonomous Transaction Processing (Shared) 19c

Spring Boot 2.3.1

JAVA 14