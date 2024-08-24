<template>
    <div>
        <div>
            <el-form :inline="true" :model="searchTable.name" class="demo-form-inline">
                <el-form-item label="姓名">
                    <el-input v-model="searchTable.name" placeholder="请输入姓名"></el-input>
                </el-form-item>
                <el-form-item label="性别">
                    <el-select v-model="searchTable.gender" placeholder="请输入性别">
                        <el-option label="男" value="1"></el-option>
                        <el-option label="女" value="2"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item>
                    <div class="block">
                        <span style="margin-right: 10px;">入职日期</span>
                        <el-date-picker v-model="searchTable.table_date" type="daterange" range-separator="至"
                            start-placeholder="开始日期" end-placeholder="结束日期" value-format="yyyy-MM-dd">
                        </el-date-picker>
                    </div>
                </el-form-item>
                <el-form-item>
                    <el-popconfirm confirm-button-text='确定' cancel-button-text='取消' icon="el-icon-info" icon-color="red"
                        title="请确保所有内容已填妥，确认提交吗？" @confirm="onSubmit()">
                        <el-button slot="reference" type="primary">查询</el-button>
                    </el-popconfirm>
                </el-form-item>
            </el-form>
        </div>
        <el-divider></el-divider>
        <div style="display: flex; justify-content:left; margin-left: 10%;">
            <el-pagination background layout="prev, pager, next, sizes, jumper" :total="1000" :page-size="10">
            </el-pagination>
        </div>
        <el-divider></el-divider>
        <div>
            <el-table :data="tableData" style="width: 100%;">
                <el-table-column prop="id" label="ID">
                </el-table-column>
                <el-table-column prop="name" label="姓名">
                </el-table-column>
                <el-table-column prop="image" label="照片">
                    <template slot-scope="scope">
                        <img :src="scope.row.image" style="width: 120px; height: auto;">
                    </template>
                </el-table-column>
                <el-table-column prop="gender" label="性别">
                    <template slot-scope="scope">
                        {{ scope.row.gender == 1 ? '男' : '女' }}
                    </template>
                </el-table-column>
                <el-table-column prop="job" label="职位">
                </el-table-column>
                <el-table-column prop="entrydate" label="入职时间">
                </el-table-column>
                <el-table-column prop="updatetime" label="更新时间">
                </el-table-column>
            </el-table>
        </div>
    </div>
</template>

<script>

// mock url: https://apifoxmock.com/m1/5017378-4677041-default/mock/demo/list
import axios from 'axios';

export default {
    data() {
        return {
            searchTable: {
                name: '未知',
                gender: '未知',
                table_date: [
                    "未选择",
                    "未选择"
                ],
            },
            tableData: []
        }
    },
    methods: {
        onSubmit() {
            alert(
                '姓名：' + this.searchTable.name + '\n' +
                '性别：' + this.searchTable.gender + '\n' +
                '开始日期：' + this.searchTable.table_date[0] + '\n' +
                '结束日期：' + this.searchTable.table_date[1]
            )
        }
    },
    mounted() {
        axios.get('https://apifoxmock.com/m1/5017378-4677041-default/mock/demo/list')
            .then(response => {
                this.tableData = response.data.data;
                if (this.tableData.gender == 1) {
                    this.tableData.gender = '男';
                } else {
                    this.tableData.gender = '女';
                }
            })
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