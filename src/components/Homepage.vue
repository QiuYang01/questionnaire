<template>
<el-row style="margin: 0;padding: 0; ">
  <el-col :span="3" style=" ">
     <el-menu
      default-active="1"
      :router="true"
      :unique-opened="true"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose"
       background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
    align="left"
      style="min-height:730px; "
      >
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-setting"></i>
          <span>问卷管理</span>
        </template>
          <el-menu-item index="/homepage/myquestionnaire" style="min-width: auto;">我的问卷</el-menu-item>
          <el-menu-item index="/homepage/publish" style="min-width: auto;">发布问卷</el-menu-item>
           <el-menu-item index="#" style="min-width: auto;">修改问卷</el-menu-item>
          <el-menu-item index="#" style="min-width: auto;">删除问卷</el-menu-item>
      </el-submenu>
 <el-submenu index="2">
        <template slot="title">
          <i class="el-icon-s-data"></i>
          <span>问卷数据</span>
        </template>
          <el-menu-item index="#" style="min-width: auto;">选择问卷</el-menu-item>
          <el-menu-item index="#"    style="min-width: auto;">选项2</el-menu-item>
           <el-menu-item index="#"    style="min-width: auto;">id:{{this.$store.state.userId}}</el-menu-item>
      </el-submenu>

    </el-menu>
    </el-col>

  <el-col :span="21" >
      <div class="grid-content bg-purple-light">
         <router-view></router-view>  <!-- //子路由放的组件 -->
      </div>
  </el-col>
</el-row>
</template>
<script>
export default {
    data() {
      return {
        activeName: '1'
      };
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
}
</script>
<style scope>


  
  .bg-purple {
    background: #d3dce6;
    
  }
  .bg-purple-light {
    background: #e5e9f2;
  }


</style>