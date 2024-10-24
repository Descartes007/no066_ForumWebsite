const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot34t91/",
            name: "springboot34t91",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot34t91/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "论坛网站"
        } 
    }
}
export default base
