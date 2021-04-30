AUTOR:

    {
        "Nombre": "Miluska Mirella Romero Torres", 
    }

localhost:8073/api/author/ 

AGREGAR AUTOR:

    {
        "authorId": 2,
        "firstName": "Jose",
        "lastName": "Ventura",
        "biografy": "Arteaga"
    }
    
localhost:8073/api/book/ 

AGREGAR LIBRO:

    {
            "isbn": 4,
            "title": "Librito 2",
            "idAuthor": 2,
            "publicationDate": "2021-04-30",
            "numberOfPages": 12,
            "price": 2.4
    }

CONSULTAR LIBROS POR AUTOR:

localhost:8073/api/book/2

- *2* = id de autor 

H2: 

http://localhost:8073/h2-console/
