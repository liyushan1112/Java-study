package Bean;

public class Student {
        private String sno;//学号
        private String sname;//姓名
        private String ssex;//性别
        private String sgrade;//年级
        private String smajor;//专业
        private int sscore;//分数

        public Student() {
        }

        public Student(String sno, String sname, String ssex, String sgrade, String smajor, int sscore) {
            super();
            this.sno = sno;
            this.sname = sname;
            this.ssex = ssex;
            this.sgrade = sgrade;
            this.smajor = smajor;
            this.sscore = sscore;
        }

        public String getSno() {
            return sno;
        }
        public void setSno(String sno) {
            this.sno = sno;
        }
        public String getSname() {
            return sname;
        }
        public void setSname(String sname) {
            this.sname = sname;
        }
        public String getSsex() {
            return ssex;
        }
        public void setSsex(String ssex) {
            this.ssex = ssex;
        }
        public String getSgrade() {
            return sgrade;
        }
        public void setSgrade(String sgrade) {
            this.sgrade = sgrade;
        }
        public String getSmajor() {
            return smajor;
        }
        public void setSmajor(String smajor) {
            this.smajor = smajor;
        }
        public double getSscore() {
            return sscore;
        }
        public void setSscore(int sscore) {
            this.sscore = sscore;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "sno='" + sno + '\'' +
                    ", sname='" + sname + '\'' +
                    ", ssex='" + ssex + '\'' +
                    ", sgrade='" + sgrade + '\'' +
                    ", smajor='" + smajor + '\'' +
                    ", sscore=" + sscore +
                    '}';
        }
}
