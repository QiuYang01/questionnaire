<template>
<div>
    <el-button @click="drawer = true" type="primary" style="margin-left: 16px;">
    点我打开
    </el-button>

    <el-drawer
    :visible.sync="drawer"
    size="90%"
    direction="ttb"   
    :before-close="handleClose">
     <!-- <span>我来啦!</span> -->
     <carousel></carousel>
    </el-drawer>

</div>
</template>
<script>
import carousel from '@/components/userPage/carousel'


  export default {
    components:{carousel},
    data() {
      return {
        drawer: false,
        direction: 'ttb',
      };
    },
    methods: {
      handleClose(done) {
        this.$confirm('确认关闭？')
          .then(_ => {
            done();
          })
          .catch(_ => {});
      }
    }
  };
</script>