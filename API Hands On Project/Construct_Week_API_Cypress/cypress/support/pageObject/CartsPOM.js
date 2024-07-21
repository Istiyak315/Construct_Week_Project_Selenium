class RAPI{
    AllCarts(method,url,statuscode){
        cy.request({
            method:method,
            url:url,
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }

    singleCart(method,url,statuscode){
        cy.request({
            method:method,
            url:url,
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }

    CartByUser(method,url,statuscode){
        cy.request({
            method:method,
            url:url,
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }

    singleCart(method,url,statuscode){
        cy.request({
            method:method,
            url:url,
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }

    newCart(method,url,statuscode,headers,data){
        cy.request({
            method:method,
            url:url,
            headers:headers,
            body:data
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }

    UpdateCart(method,url,statuscode,headers,data){
        cy.request({
            method:method,
            url:url,
            headers:headers,
            body:data
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }

    DeleteCart(method,url,statuscode){
        cy.request({
            method:method,
            url:url,
        }).then((response)=>{
            expect(response.status).to.equal(statuscode)
            const res=JSON.stringify(response.body)
            cy.log(res)
        })
    }


}

export default RAPI