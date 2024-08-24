<template>
  <div>
      <el-container style="height: 100vh;"> <!-- style="height: 100vh;" -->
          <el-header>
              <span style="font-size: 40px; font-weight: bold;">Tlias智能学习辅助系统</span>
          </el-header>
          <el-container>
              <el-aside width="200px">
                  <el-menu :default-openeds="['1']">
                      <el-submenu index="1">
                          <template slot="title">
                              <i class="el-icon-location"></i>
                              <span>系统主菜单</span>
                          </template>
                          <el-menu-item-group>
                              <template slot="title">班级学员管理 >></template>
                              <el-menu-item index="1-1">班级管理</el-menu-item>
                              <el-menu-item index="1-2">学院管理</el-menu-item>
                          </el-menu-item-group>
                          <el-menu-item-group>
                              <template slot="title">系统信息管理 >></template>
                              <el-menu-item index="2-1">
                                <router-link to="/dept">部门管理</router-link>
                              </el-menu-item>
                              <el-menu-item index="2-2">
                                <router-link to="/emp">员工管理</router-link>
                              </el-menu-item>
                          </el-menu-item-group>
                          <el-menu-item-group>
                              <template slot="title">数据统计管理 >></template>
                              <el-menu-item index="3-1">员工信息管理</el-menu-item>
                          </el-menu-item-group>
                      </el-submenu>
                  </el-menu>
              </el-aside>
              <el-main>
                  <div>
                      <router-view></router-view>
                  </div>
              </el-main>
          </el-container>
      </el-container>
  </div>
</template>

<script>
export default {
  data() {
    return {
      isMenuOpen: true,
    }
  }
}

</script>


<style>
.el-header,
.el-footer {
  /* background-color: #B3C0D1; */
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  /* background-color: #D3DCE6; */
  color: #333;
  /* text-align: center; */
  line-height: 200px;
}

.el-main {
  /* background-color: #E9EEF3; */
  color: #333;
  text-align: center;
  /* line-height: 160px; */
}
</style>