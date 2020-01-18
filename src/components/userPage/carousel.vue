<template>
     <div class="block">
    <!-- <span class="demonstration">Click 指示器触发</span> -->
    <el-carousel height="350px" ref="carousel" :autoplay="false" type="card" trigger="click"  indicator-position="outside" arrow="never">
      <el-carousel-item v-for="item in dynamicValidateForm.questionAndOptions" :key="item.keys" >
        <h3 class="small">{{ item.questinContext }}</h3>
        <!-- //题目 -->
        <div>
          {{ item.questinContext }}
        </div>
        <!-- //选项 -->
        <div>
           <div style="margin-top: 20px">
            <el-radio style="width:80%;padding:10px;margin:0;text-align:left;height:auto" v-model="answers[dynamicValidateForm.questionAndOptions.indexOf(item)]" label="1" border>{{item.option1}}</el-radio>
            <el-radio style="width:80%;padding:10px;margin:0;text-align:left;height:auto" v-model="answers[dynamicValidateForm.questionAndOptions.indexOf(item)]" label="2" border>{{item.option2}}</el-radio>
            <el-radio style="width:80%;padding:10px;margin:0;text-align:left;height:auto" v-model="answers[dynamicValidateForm.questionAndOptions.indexOf(item)]" label="3" border >{{item.option3}}</el-radio>
            <el-radio style="width:80%;padding:10px;margin:0;text-align:left;height:auto" v-model="answers[dynamicValidateForm.questionAndOptions.indexOf(item)]" label="4" border >{{item.option4}}</el-radio>
          </div>
        </div>

      </el-carousel-item>
    </el-carousel>
    <div>
    <el-button  type="primary" @click="prev">上一题</el-button>&nbsp;&nbsp;&nbsp;&nbsp;
    <el-button  type="primary" @click="next">下一题</el-button>
    </div>
    <div style="margin-top:20px">
        <el-button v-show="(this.position+1)%this.dynamicValidateForm.questionAndOptions.length===0" style="width:10%" type="danger" round @click="submit">提 交</el-button>
   
    </div>
  </div>
</template>
<script>
export default {
  props:["questionaire_id"], //父组件传过来的问卷id
  data() {
    return {
      position:0, //当前题目的位置
      user_ip:'',
      answers:[], //答案
       dynamicValidateForm: {
          questionAndOptions: [{ 
            questinContext: 'wenti1', 
            option1: '1111111111111111111111', 
            option2: '1',
            option3: '1',
            option4: '1',
            keys:''
          },
          { 
            questinContext: 'wenti2',
            option1: '2', 
            option2: '2',
            option3: '2',
            option4: '2',
            key:''
          },
          { 
            questinContext: 'wenti3',
            option1: '3', 
            option2: '3',
            option3: '3',
            option4: '3',
            key:''
          },{ 
            questinContext: 'wenti4',
            option1: '4', 
            option2: '4',
            option3: '4',
            option4: '4',
            key:''
          },],
          name: '',
          time:''
        }
    }
  },
  methods: {
    prev(){
     
      console.log(this.parentwjid);
      this.position--;
      this.$refs.carousel.prev();
    },
    next(){
      this.position++;
      //console.log(this.answers.length===this.dynamicValidateForm.questionAndOptions.length);
    //  console.log(this.answers)
      // alert(this.position)
      this.$refs.carousel.next();
      
    },
    submit(){
      if(this.answers.length===this.dynamicValidateForm.questionAndOptions.length)
      {
        console.log("chenggong");
        console.log(this.answers)
      }
      
      else
      console.log("shibai");
    }
  },
  created(){
    console.log(this.questionaire_id); //可以在这里发请求，初始化数据
  }
    
}
</script>
<style  scoped>
  .block{
    height: 90%;
    width: 100%;
    margin: 0 auto;
   
  }

  .el-carousel__item:nth-child(2n) {
     background-color: #99a9bf;
  }
  
  .el-carousel__item:nth-child(2n+1) {
     background-color: #d3dce6;
  }
</style>
