// 销售员
const signInBtn = document.getElementById("signIn");
// 管理员
const signUpBtn = document.getElementById("signUp");

// // 这两是登录
// const fistForm = document.getElementById("form1");
// //管理
// const secondForm = document.getElementById("form2");
// //销售

// const btn1 = document.getElementById("#btn1")
// const btn2 = document.getElementById("#btn2")

const container = document.querySelector(".container");

signInBtn.addEventListener("click", () => {
    container.classList.remove("right-panel-active");
});

signUpBtn.addEventListener("click", () => {
    container.classList.add("right-panel-active");
});

// btn1.addEventListener("click", submit("1"));
// btn2.addEventListener("click", submit("2"));
// fistForm.addEventListener("submit", (e) => e.preventDefault());
// secondForm.addEventListener("submit", (e) => e.preventDefault());


function submit_(type){
    // alert("111111111111111111111111")
    var uid = "#username"
    var pid = "#password"
    // alert("您已于其他设备登录");
    var username = document.querySelector(uid+type).value;
    // alert("uid+type="+uid+type)
    var password = document.querySelector(pid+type).value;
    // alert(username)
    // alert(password)
    // alert("type="+type)

    $.ajax({
        url: "login/isLogin",
        data: {
            "username": username,
            "password": password,
            "type": type
        },
        type: "get",
        // async: false,//这里这里，要用同步请求
        async: true,
        dataType: "json",
        success: function (obj) {
            // alert('运行成功')
            // alert("成功返回+"+obj)
            if(obj === "error"){
                alert("用户名或密码输入有误！！！")
            }else{
                // location.href="index_manager.html";
                location.href=(type === "1") ? "index_manager.html" : "index_sale.html";
            }

            return false;
        }
    })
}