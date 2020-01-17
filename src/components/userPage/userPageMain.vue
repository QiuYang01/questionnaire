<template>
<div >
    <div @click="read(key)" v-for="o in 4" :key="o">
    <el-card class="box-card" shadow="always" >
        <div class="name"><label>问卷名</label>{{''}}</div>
        <div class="time"><label>时间</label></div>
        <div class="id"><label>问卷号</label></div>
        <div class="user"><label>发布者</label></div>
    </el-card>
    </div>
     <el-card class="box-card" shadow="always" >
        <div class="name"><label>问卷名</label></div>
        <div class="time"><label>时间</label></div>
        <div class="id"><label>问卷号</label></div>
        <div class="user"><label>发布者</label></div>
    </el-card>
 </div>
</template>
<script>
export default {
    data() {
        return {
          allinfo:[{
              name:'',
              time:'',
              id:'',
              user:'',
          }]  
        }
    },
    methods:{
        read(key){ //点击后
            alert(key);
        }
    },
    created(){  //获取数据

    }
}
</script>
<style  scoped>
.name,
.id{
    width: 70%;
    float: left;
    padding-bottom: 18px;
     overflow: hidden;  /* //超出文字省略号 */
    text-overflow:ellipsis;
    white-space: nowrap;
}
.time,
.user{
    width: 20%;
    float: right;
     padding-bottom: 18px;
     overflow: hidden;
    text-overflow:ellipsis;
    white-space: nowrap;
}
label {
    font-size: 16px;
    color: skyblue;
    padding-right: 10px
}

  .box-card {
    width: 80%;
    margin: 10px auto;
    text-align: left;
    font-size: 16px;
 
  }
</style>