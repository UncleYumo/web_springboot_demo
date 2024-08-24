<template>
    <div>
        <el-main>
            <!-- 表格 -->
            <el-table :data="tableData" border>
                <el-table-column prop="name" label="名称" width="250"></el-table-column>
                <el-table-column prop="updatetime" label="最后操作时间" width="250"></el-table-column>
                <el-table-column label="操作">
                    <el-button type="primary" size="mini">编辑</el-button>
                    <el-button type="danger" size="mini">删除</el-button>
                </el-table-column>
            </el-table>
        </el-main>
    </div>
</template>

<script>
export default {
    data() {
        return {
            tableData: [{
                id: 1,
                name: "学工部",
                updatetime: "2010-01-01 12:00:00"
            }, {
                id: 2,
                name: "教研部",
                updatetime: "2010-01-01 12:00:00"
            }, {
                id: 3,
                name: "就业部",
                updatetime: "2010-01-01 12:00:00"
            }, {
                id: 4,
                name: "人事部",
                updatetime: "2010-01-01 12:00:00"
            }, {
                id: 5,
                name: "行政部",
                updatetime: "2010-01-01 12:00:00"
            }]
        }
    },
    methods: {

    }
}
</script>

<style></style>