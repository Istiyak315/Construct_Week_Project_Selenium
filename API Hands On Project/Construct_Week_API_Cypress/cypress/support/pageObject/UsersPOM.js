class RestAPI{

    getAllOrder(method,Url,statuscode,headers){
       cy.request({
        method: method,
        url: Url,
        headers:headers
       }).then((response)=>{
        expect(response.status).to.equal(statuscode)
        const res = JSON.stringify(response.body);
        cy.log(res);
       })

    }

    LoginUser(method,Url,statuscode,data,headers){
        cy.request({
            method: method,
            url: Url,
            headers:headers,
            body:data
        }).then((response)=>{
            const res = JSON.parse(JSON.stringify(response.body));
            expect(res).have.property("token");
            const Token = res.token;
            return Token;
           
            
        })

    }

    CurrentUser(method,Url,Token,statuscode){

        cy.request({
            method: method,
            url: Url,
            headers:{
                "accept": "application/json",
                "Authorization": 'Bearer ${Token}'
            },failOnStatusCode: false
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res =JSON.stringify(response.body);
            cy.log(res);
        })

    }

    singleUser(method,Url,statuscode,headers){
        cy.request({
            method: method,
            url: Url,
            headers:headers
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body);
            cy.log(res);
        })

    }

    SearchUser(method,Url,statuscode){
        cy.request({
            method: method,
            url: Url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body);
            cy.log(res);
        })

    }

    FilterUser(method,Url,statuscode){
        cy.request({
            method: method,
            url:Url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body);
            cy.log(res);

        })

    }

    LimitSkip(method,Url,statuscode){
        cy.request({
            method: method,
            url: Url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body);
            cy.log(res);
        })
    }

    LimitSkip2(method,Url,statuscode){
        cy.request({
            method: method,
            url:Url
        }).then((response)=>{

            expect(response.status).to.equal(statuscode);
            const res = JSON.stringify(response.body);
            cy.log(res)
        })
    }

    UserCart(method,Url,statuscode){
        cy.request({
            method:method,
            url:Url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }

    UserPost(method,Url,statuscode){
        cy.request({
            method:method,
            url:Url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }

    UserTodo(method,url,statuscode){
        cy.request({
            method:method,
            url:url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }

    newUser(method,url,statuscode){
        cy.request({
            method:method,
            url:url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }

    addUser(method,url,statuscode,headers,data){
        cy.request({
            method:method,
            url:url,
            headers:headers,
            body:data
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }

    UpdateUser(method,url,statuscode,headers,data){
        cy.request({
            method:method,
            url:url,
            headers:headers,
            body:data
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }

    DeleteUser(method,url,statuscode){
        cy.request({
            method:method,
            url:url
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res = JSON.stringify(response.body)
            cy.log(res)
        })
    }
    
}
export default RestAPI;