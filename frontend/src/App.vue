<template>
  <BaseHeader />
  <div style="display: flex">
    <BaseSide />
    <div>
      <HelloWorld msg="Hello Vue 3.0 + Element Plus + Vite" />
    </div>
  </div>
</template>

<style>
#app {
  text-align: center;
  color: var(--el-text-color-primary);
}

body {
  font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB",
    "Microsoft YaHei", "微软雅黑", Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin: 0;
}

a {
  color: var(--el-color-primary);
}

code {
  border-radius: 2px;
  padding: 2px 4px;
  background-color: var(--el-color-primary-light-9);
  color: var(--el-color-primary);
}
</style>