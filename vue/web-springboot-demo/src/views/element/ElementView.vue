<template>
    <div class="element-view">
        <div>
            <el-row>
                <el-button plain>朴素按钮</el-button>
                <el-button type="primary" plain>主要按钮</el-button>
                <el-button type="success" plain>成功按钮</el-button>
                <el-button type="info" plain>信息按钮</el-button>
                <el-button type="warning" plain>警告按钮</el-button>
                <el-button type="danger" plain>危险按钮</el-button>
            </el-row>
        </div>
        <br>
        <div>
            <el-table :data="tableData" style="width: 100%">
                <el-table-column prop="date" label="日期" width="180">
                </el-table-column>
                <el-table-column prop="name" label="姓名" width="180">
                </el-table-column>
                <el-table-column prop="address" label="地址">
                </el-table-column>
            </el-table>
        </div>

        <div>
            <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
                :current-page.sync="currentPage1" :page-size="100" :page-sizes="[10, 30, 300, 400000]"
                layout="sizes, total, prev, pager, next" :total="1000">
            </el-pagination>
        </div>
        <br>
        <div>
            <el-button type="text" @click="dialogVisible = true">点击打开 Dialog</el-button>

            <el-dialog title="提示" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
                <span>
                    <el-form ref="form" :model="form" label-width="80px">
                        <el-form-item label="活动名称">
                            <el-input v-model="form.name"></el-input>
                        </el-form-item>
                        <el-form-item label="活动区域">
                            <el-select v-model="form.region" placeholder="请选择活动区域">
                                <el-option label="区域一" value="shanghai"></el-option>
                                <el-option label="区域二" value="beijing"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="活动时间">
                            <el-col :span="11">
                                <el-date-picker type="date" placeholder="选择日期" v-model="form.date1"
                                    value-format="yyyy MM dd" style="width: 100%;"></el-date-picker>
                            </el-col>
                            <el-col class="line" :span="2">-</el-col>
                            <el-col :span="11">
                                <el-time-picker placeholder="选择时间" v-model="form.date2" value-format="HH:mm:ss"
                                    style="width: 100%;"></el-time-picker>
                            </el-col>
                        </el-form-item>
                        <el-form-item>
                            <el-button type="primary" @click="onSubmit">立即创建</el-button>
                            <el-button @click="dialogVisible = false">关闭</el-button>
                        </el-form-item>
                    </el-form>
                </span>
            </el-dialog>
        </div>
        <div v-for="(item, index) in form" :key="index">
            <span v-if="index === 'date1'">
                date1 | {{ item }}
            </span>
            <span v-if="index === 'date2'">
                date2 | {{ item }}
            </span>
        </div>
        <div>
            <button @click="showTimeFormated()">Show Time Formated</button>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            tableData: [{
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-04',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1517 弄'
            }, {
                date: '2016-05-01',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1519 弄'
            }, {
                date: '2016-05-03',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1516 弄'
            }],
            dialogVisible: false,
            form: {
                name: '',
                region: '',
                date1: '',
                date2: ''
            },
        }
    },
    methods: {
        onSubmit() {
            alert('活动创建成功');
            // this.dialogVisible = false;
        },
        getFormatedDate() {
            let date = this.form.date1.split(" ");
            let year = date[0];
            let month = date[1];
            let day = date[2];
            return year + "-" + month + "-" + day + " ";
        },
        showTimeFormated() {
            alert(this.getFormatedDate());
        },
    }
}
</script>

<style></style>
