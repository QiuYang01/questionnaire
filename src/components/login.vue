<template>
    
<el-container>
  <el-header style="font-size:30px;color:#409EFF;font-family:楷体">问卷调查后台管理系统</el-header>
  <el-container>
    <el-aside width="35%"></el-aside>
    <el-main>
        <el-input style="margin-top: 15%;" type="text" autosize placeholder="请输入账号"  v-model="id"></el-input>
        <div style="margin: 15%;"></div>
         <el-input type="password" autosize placeholder="请输入密码"  v-model="password"></el-input>
         <div style="margin: 15%;"></div>
         <el-button style="width: 30%;font-size:20px"  type="primary" @click='submit' >登  录</el-button>
         &#12288;&#12288;&#12288;&#12288;
         <router-link to='register'><el-button type="text" size="mini" >去注册</el-button></router-link>
    </el-main>
    <el-aside width="35%"></el-aside>
  </el-container>
</el-container>
</template>
<script>
export default {
     data() { 
    return {
      id: '',
      password:''
    }
  },
  methods:{
    submit(){
      this.axios.get('http://127.0.0.1:8888/user/login', 
                  {params : {user_id:this.id , user_password:this.password}}) 
        .then((response)=> {
        console.log(response);
         this.$store.dispatch('setUserIdFun',this.id); //保存用户的id
        this.$router.push({ path: '/homepage' });
        })
        .catch(function (error) {
        console.log(error);
        });
    }
  }
}
</script>