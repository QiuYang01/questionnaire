<template>
    <el-form :model="dynamicValidateForm" ref="dynamicValidateForm" label-width="100px" class="demo-dynamic">
<el-input placeholder="请输入问卷名" v-model="dynamicValidateForm.questinContext" style="width:80%"></el-input>
  <el-form-item
    v-for="(questionAndOption, index) in dynamicValidateForm.questionAndOptions"
    :label="'题目' + index"
    :key="questionAndOption.key"
    :prop="'questionAndOptions.' + index + '.questinContext'"
    :rules="{required: false, message: '题目不能为空', trigger: 'blur'
    }">
   <el-input placeholder="请输入题目" v-model="questionAndOption.questinContext"></el-input>
   <el-input placeholder="请输入选项A" v-model="questionAndOption.option1"><template slot="prepend">A</template></el-input>
   <el-input placeholder="请输入选项B" v-model="questionAndOption.option2"><template slot="prepend">B</template></el-input>
   <el-input placeholder="请输入选项C" v-model="questionAndOption.option3"><template slot="prepend">C</template></el-input>
   <el-input placeholder="请输入选项D" v-model="questionAndOption.option4"><template slot="prepend">D</template></el-input>
   <el-button @click.prevent="removeDomain(questionAndOption)">删除</el-button>
  </el-form-item>

  <el-form-item>
    <el-button type="primary" @click="submitForm(dynamicValidateForm)">提交</el-button>
    <el-button @click="addDomain">添加题目</el-button>
    <!-- <el-button @click="resetForm(dynamicValidateForm)">重置</el-button> -->
  </el-form-item>
</el-form>
</template>
<script>
  export default {
    data() {
      return {
        dynamicValidateForm: {
          questionAndOptions: [{
            questinContext: '',
            option1: '',
            option2: '',
            option3: '',
            option4: '',
            key:''
          }],
          name: ''
        }
      };
    },
    methods: {
      submitForm(formName) {
          console.log(formName);
        // this.$refs[formName].validate((valid) => {
        //   if (valid) {
        //     alert('submit!');
        //   } else {
        //     console.log('error submit!!');
        //     return false;
        //   }
        // });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      },
      removeDomain(item) {
        var index = this.dynamicValidateForm.questionAndOptions.indexOf(item)
        console.log(index);
        if (index !== -1) {
          this.dynamicValidateForm.questionAndOptions.splice(index, 1)
        }
      },
      addDomain() {
        this.dynamicValidateForm.questionAndOptions.push({
          questinContext: '',
            option1: '',
            option2: '',
            option3: '',
            option4: '',
            key: Date.now()
        });
      }
    }
  }
</script>
