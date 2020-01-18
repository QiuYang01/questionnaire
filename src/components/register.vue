<template>
<div>
    <el-container>
        <el-header style="color:#409EFF;">
            注册为管理员
        </el-header>
    </el-container>
    <el-row>
    <el-col :span="7"><div ><br/></div></el-col>
    <el-col :span="10">
        <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="账号" prop="id">
            <el-input v-model.number="ruleForm.id" ref="id"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="pass">
            <el-input type="password" v-model="ruleForm.pass" autocomplete="off" ref="password"> </el-input>
        </el-form-item>
        <el-form-item label="确认密码" prop="checkPass">
            <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item>&#12288;&#12288;
            <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>&#12288;&#12288;&#12288;&#12288;
            <el-button @click="resetForm('ruleForm')">重置</el-button>&#12288;&#12288;&#12288;
             <router-link to='/login'><el-button type="text" size="mini" >去登录</el-button></router-link>
        </el-form-item>
        </el-form>
    </el-col>
    <el-col :span="7"><br/></el-col>
    </el-row>

</div>
</template>
<script>

  export default {
    data() {
      var checkId = (rule, value, callback) => {
           console.log(value);
        if (!value) {
          return callback(new Error('账号不能为空'));
        }
        setTimeout(() => {
          if (!Number.isInteger(value)) {
            callback(new Error('请输入数字值'));
          } else {
            if (value > 999999||value < 100000) {
              callback(new Error('请输入六位数的账号'));
            } else {
              callback();
            }
          }
        }, 1000);
      };
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请再次输入密码'));
        } else if (value !== this.ruleForm.pass) {
          callback(new Error('两次输入密码不一致!'));
        } else {
          callback();
        }
      };
      return {
        ruleForm: {
          pass: '',
          checkPass: '',
          id: ''
        },
        rules: {
          pass: [
            { validator: validatePass, trigger: 'blur' }
          ],
          checkPass: [
            { validator: validatePass2, trigger: 'blur' }
          ],
          id: [
            { validator: checkId, trigger: 'blur' }
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
         
        this.$refs[formName].validate((valid) => {
          if (valid) {
              // 验证成功
            console.log( "账号"+this.$refs.id.value)
            console.log( "密码"+this.$refs.password.value)
        //  var params = new URLSearchParams();
        //   params.append('name',this.$refs.id.value);
           console.log(this.qs.stringify({user_id:this.$refs.id.value,user_password:this.$refs.id.value}))
           this.axios.post('http://127.0.0.1:8888/user/register', 
                            this.qs.stringify({user_id:this.$refs.id.value , use_password:this.$refs.password.value}))
            .then( (response) => {
              console.log(response);
            })
            .catch( (error) => {
              console.log(error);
            }).finally(function () {    
        });
      
                                            //this.qs.stringify(this.$refs.id.value)
        // this.axios.post('http://127.0.0.1:9000/io/addproduct',   qs.stringify(this.$refs.id.value))
        // .then(function (response) {
        //     console.log(response);
        // })
        // .catch(function (error) {
        //     console.log(error);
        // });

          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>


