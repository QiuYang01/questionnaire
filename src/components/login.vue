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
         <el-button style="width: 30%;font-size:20px"  type="primary" @click='check' >登  录</el-button>
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
    check(){
      
    }
  }
}
</script>