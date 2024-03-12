To run this project on your local machine follow the following steps:-
1- clone this repository

2- run this project through your prefered ide

3- open http://localhost:8080




This cart service has several functionality:-
1) Get all carts - by going to http://localhost:8080/carts

2) Get a single cart - by going to http://localhost:8080/carts/{id}

3) Get carts in date range - by following the following structure:-
         http://localhost:8080/carts?startdate=2019-12-10&enddate=2020-10-10
   you can change the startDate or endDate

4) Get a user's cart - by going to http://localhost:8080/carts/user/{id}

5) Add a new cart - by providing a mock cart through post method by going to http://localhost:8080/carts

6) Update a cart - by providing a mock cart through post method by going to http://localhost:8080/carts/{id}

7) Delete a cart - by going to http://locahost:8080/carts/{id}

A mock cart may look like-
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

      
