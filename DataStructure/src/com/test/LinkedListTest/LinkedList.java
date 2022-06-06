package cn.puge.day02;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/3/7 4:47 PM
 */
public class LinkedList {

    public static void main(String[] args) {
        //创建节点，添加测试数据
        HeroNode hero1 = new HeroNode(1, "孙悟空", "行者");
        HeroNode hero2 = new HeroNode(2, "猪悟能", "八戒");
        HeroNode hero3 = new HeroNode(3, "沙悟净", "沙僧");
        HeroNode hero4 = new HeroNode(4,"唐僧","无欲无求");

        //创建一个列表，初始化
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //用这种歌方式插入，是根据插入的顺序排序的
        //调用添加方法，将节点加入到链表中
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero4);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero2);


        singleLinkedList.list();
    }


    /**
     * 定义方法，对单链表进行管理
     */
    static class  SingleLinkedList{

        //先初始化一个头节点。
        private final HeroNode head = new HeroNode(0,"","");

        /**
         * 定义一个方法，用于添加一个节点
         * 当不考虑编号的顺序时
         *  1，找到当前列表的最后节点
         *  2，将最后这个节点的next，指向  新的节点。
         */
        public void add(HeroNode heroNode){
            //因为head节点不能动，因此我们需要一个辅助遍历temp
            HeroNode temp = head;
            //遍历链表，找到最后
            while (true){
                //找到链表的最后
                if (temp.next == null){
                    break;
                }
                //如果没有找到最后，需要将temp后移
                temp = temp.next;
            }
            //当退出while循环时，temp就指向了链表的最后
            //将最后这个节点的next 指向新节点
            temp.next = heroNode;
            System.out.println("当前的节点为："+temp);
        }

        //第二种方式在添加节点的时候，根据排名将节点插入到指定位置
        //如果存在这个排名则添加失败，并给出提示
        public void addByOrder(HeroNode heroNode){
            //因为头节点不能动，因此我们仍然需要痛殴一个辅助指针（变量）来帮助我们找到添加的位置
            //因为是单链表，因此我们找的temp是位于添加位置的前一个节点，否则插入不了
            HeroNode temp = head;
            boolean flag = false;  //flag标志添加的序号，默认为false
            while (true){
                //说明temp已经在链表的最后
                if (temp.next == null){
                    break;
                }
                //位置已经找到，就在temp后面插入
                if (temp.next.no > heroNode.no ){
                    break;
                    //说明希望添加的heroNode的编号已经存在
                }else if (temp.next.no == heroNode.no){
                    flag = true;//说明编号存在
                    break;
                }
                temp = temp.next;  //后移，遍历当前链表
            }
            //判断flag的值
            if (flag){ //不能添加说明编号存在
                System.out.printf("准备插入的节点的编号 %d 已经存在，不能加入 \n",heroNode.no);
            }else {
                //插入链表[遍历]
                heroNode.next = temp.next;
                temp.next = heroNode;
            }
        }


        //修改节点的信息，根据no编号来修改，即no编号不能改。
        //说明
        //1，根据newHeroNOde 的no 来修改即可
        public void update(HeroNode newHeroNode){
            //判断是否为空
            if (head.next == null){
                System.out.println("链表为空————————————");
                return;
            }
            //找到需要修改的节点，根据no编号
            //定义一个辅助变量
            HeroNode temp = head.next;
            boolean flag = false;  //表示是否可以找到该节点
            while (true){
                if (temp == null){
                    break;  //已经遍历完链表
                }
                if (temp.no == newHeroNode.no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            //根据flag  判断是否找到要修改的节点
            if (flag){
                temp.name = newHeroNode.name;
                temp.nickName = newHeroNode.nickName;
            }else {  //没有找到
                System.out.printf("没有找到 编号 %d 的节点，不能修改\n",newHeroNode.no);

            }
        }


        //显示链表，进行遍历
        public void list(){
            //判断链表是否为空
            if (head.next == null){
                System.out.println("链表为空，请添加数据");
                return;
            }
            //因为头节点，不能动，因此我们需要一个辅助变量来遍历
            HeroNode temp = head.next;
            while (true){
                //判断是否到链表的最后
                if (temp == null){
                    break;
                }
                //输出节点的信息
                System.out.println(temp);
                //将temp后移，注意容易造成死循环
                temp = temp.next;
            }
        }
    }






    /**
     * 定义 HeroNode，一个HeroNode 就是一个节点
     */
    static class HeroNode{
        public int no;
        public String name;
        public String nickName;
        //指向下一个节点
        public HeroNode next;

        //构造器
        public HeroNode(int no,String name,String nickName){
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }
        //为了方便重写toString方法
        //@Override
        //public String toString() {
        //    return "HeroNode{" +
        //            "no=" + no +
        //            ", name='" + name + '\'' +
        //            ", nickName='" + nickName + '\'' +
        //            ", next=" + next +
        //            '}';
        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +
                    '}';
        }
    }
}
