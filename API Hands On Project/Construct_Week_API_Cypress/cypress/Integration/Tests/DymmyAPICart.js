///<reference types="Cypress"/>
import RAPI from "../../support/pageObject/CartsPOM";

describe('Rest API for dummyAPI Users', () => {
    const Cartapi=new RAPI();

    it('Get all carts', () => {
        Cartapi.AllCarts("GET",'https://dummyjson.com/carts',200)
    });

    it('Get singgle cart', () => {
        Cartapi.singleCart("GET",'https://dummyjson.com/carts/1',200)
    });

    it('Get carts by a user', () => {
        
        Cartapi.CartByUser("GET",'https://dummyjson.com/carts/user/5',200)
    });

    it('Add new Cart', () => {
        
        Cartapi.newCart("POST",'https://dummyjson.com/carts/add',201,{ 'Content-Type': 'application/json' },
            {userId: 1,products: [{id: 144,quantity: 4,},{id: 98,quantity: 1,}]}
    )
    });

    it('Update Cart', () => {
        
        Cartapi.UpdateCart("PUT",'https://dummyjson.com/carts/1',200,{ 'Content-Type': 'application/json' },
        {products: [{id: 1,quantity: 1,},]}
    )
    });

    it('Delete Cart', () => {
        Cartapi.DeleteCart("DELETE",'https://dummyjson.com/carts/1',200)
    });
});
