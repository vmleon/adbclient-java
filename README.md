# Autonomous Database with Spring Boot

Oracle Autonomous Database makes you use a wallet to establish a secure connection.

Wallet contains all the cryptographic material to authenticate and encrypt all your queries.

This is an example of how to configure it in Spring Boot.

## Requirements:

In order to run this example you need an **active Oracle Cloud Account**. If you don't have one:

[>> Please Sign-Up a Free Tier Oracle Cloud account <<](http://bit.ly/34TzwGf)

> It takes few minutes to fully-provision your account.

### Autonomous Database

You need to create an Autonomous Database.

If you don't have one, you can follow the steps on [this Lab](https://github.com/vmleon/OracleATPGettingStarted/blob/master/lab100/README.md).

It also explains how to Download the Wallet, step needed to connect from Spring Boot.

### Run application

To Run the Spring Boot application you need to export the following environment variables:

- **TNS_ADMIN**=/Path/to/your/wallet
- **DB_SERVICE**=<db_service_name>
- **DB_USER**=<your_db_user>
- **DB_PASSWORD**=<your_db_password>

> This code was verified with:
> 
> - Oracle Autonomous Transaction Processing (Shared) 19c
> - Spring Boot 2.3.1
> - JAVA 14
>

## Test the application

Make sure you have [`curl`](https://curl.haxx.se/) and [`jq`](https://stedolan.github.io/jq/) before you run the command.

```bash
curl -s localhost:8080/ | jq .
```

You should get something like this:

```json
{
  "banner": "Oracle Database 19c Enterprise Edition Release 19.0.0.0.0 - Production"
}
```