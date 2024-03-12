# To run this project on your local machine follow the following steps:-

1- clone this repository

2- run this project through your prefered ide

3- open http://localhost:8080




# This cart service has several functionality:-

1) Get all carts - by going to http://localhost:8080/carts

![image](https://github.com/Sushant9473/cartService/assets/72797131/85a64225-2b0e-4cba-ad31-be6a15951c94)


2) Get a single cart - by going to http://localhost:8080/carts/{id}

![Screenshot 2024-03-12 at 5 31 56 PM](https://github.com/Sushant9473/cartService/assets/72797131/1b25d8d5-e71c-42db-a6a0-20232889dedc)


3) Get carts in date range - by following the following structure:-
         http://localhost:8080/carts?startdate=2019-12-10&enddate=2020-10-10
   you can change the startDate or endDate

![image](https://github.com/Sushant9473/cartService/assets/72797131/431b8e3b-384f-43a9-ae01-380494063ce9)

4) Get a user's cart - by going to http://localhost:8080/carts/user/{id}

![image](https://github.com/Sushant9473/cartService/assets/72797131/42a5dd0c-2794-4c6c-8ebd-86871ea15e9b)

5) Add a new cart - by providing a mock cart through post method by going to http://localhost:8080/carts

![image](https://github.com/Sushant9473/cartService/assets/72797131/54f23a12-00f5-4e29-b898-fcb88bc353de)

6) Update a cart - by providing a mock cart through post method by going to http://localhost:8080/carts/{id}

![image](https://github.com/Sushant9473/cartService/assets/72797131/c121fba7-4274-432d-af07-ec3c8feb2032)

7) Delete a cart - by going to http://locahost:8080/carts/{id}

![image](https://github.com/Sushant9473/cartService/assets/72797131/81f4ce06-c2e2-41fe-8d5e-3978d3b1ed2a)

A mock cart may look like-
```
{
    "userId": 1,
    "date": "2020-01-02",
    "products": [
      {
        "productId": 2,
        "quantity": 4
      },
      {
        "productId": 1,
        "quantity": 10
      },
      {
        "productId": 5,
        "quantity": 2
      }
    ]
}
```

      
