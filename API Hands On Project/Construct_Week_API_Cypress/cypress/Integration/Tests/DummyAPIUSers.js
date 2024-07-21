///<reference types="Cypress"/>
import RestAPI from "../../support/pageObject/UsersPOM";


describe('Rest API for dummyAPI Users', () => {
const api=new RestAPI();
let Token;
    it('Get All User', () => {
        api.getAllOrder("GET","https://dummyjson.com/users",200)
    });

    it.only('Login User ', () => {
        api.LoginUser("POST","https://dummyjson.com/user/login",200,{
            username: 'emilys',
            password: 'emilyspass',
        })
    });

    it.only('Get current authenticated user', () => {
        api.CurrentUser("GET","https://dummyjson.com/user/me",Token,401)
    });

    it('Get a single user', () => {
        api.singleUser("GET","https://dummyjson.com/users/1",200,{
            accept: "application/json",
        })
    });

    it('Search User', () => {
        api.SearchUser("GET",'https://dummyjson.com/users/search?q=John',200)
    });

    it('Filter User', () => {
        api.FilterUser("GET",'https://dummyjson.com/users/filter?key=hair.color&value=Brown',200)
    });

    it('limit and skip user', () => {
        api.LimitSkip("GET",'https://dummyjson.com/users?limit=5&skip=10&select=firstName,age',200)
    });

    it('Limit and skip user 2', () => {
        api.LimitSkip2("GET",'https://dummyjson.com/users?sortBy=firstName&order=asc',200)
    });

    it('Get users carts by user id', () => {
        api.UserCart("GET",'https://dummyjson.com/users/6/carts',200)
    });

    it('Get users posts by user id', () => {
        api.UserPost("GET",'https://dummyjson.com/users/5/posts',200)
    });

    it('Get users todos by user id', () => {
        api.UserTodo("GET",'https://dummyjson.com/users/5/todos',200)
    });

    it('Add a new user', () => {
        api.addUser("POST",'https://dummyjson.com/users/add',201,{'Content-Type': 'application/json'},
            {firstName: 'Muhammad',lastName: 'Ovi',age: 250}
        )
    });

    it('Update a user', () => {
        
        api.UpdateUser("PUT",'https://dummyjson.com/users/2',200,{'Content-Type': 'application/json'},
            {lastName: 'Owais'}
        )
    });

    it('Delete User', () => {
        api.DeleteUser("DELETE",'https://dummyjson.com/users/1',200)
    });


});
