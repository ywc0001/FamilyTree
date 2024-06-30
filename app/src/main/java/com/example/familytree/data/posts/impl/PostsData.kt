/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("ktlint:max-line-length") // String constants read better
package com.example.familytree.data.posts.impl

import com.example.familytree.R
import com.example.familytree.model.Markup
import com.example.familytree.model.MarkupType
import com.example.familytree.model.Metadata
import com.example.familytree.model.Paragraph
import com.example.familytree.model.ParagraphType
import com.example.familytree.model.Post
import com.example.familytree.model.PostAuthor
import com.example.familytree.model.PostsFeed
import com.example.familytree.model.Publication

/**
 * Define hardcoded posts to avoid handling any non-ui operations.
 */

val pietro = PostAuthor("中国家谱知识服务平台", "https://medium.com/@pmaggi")
val manuel = PostAuthor("中国家谱知识服务平台", "https://medium.com/@manuelvicnt")
val florina = PostAuthor(
    "中国家谱知识服务平台",
    "https://medium.com/@florina.muntenescu"
)
val jose =
    PostAuthor("中国家谱知识服务平台", "https://medium.com/@JoseAlcerreca")

val publication = Publication(
    "中国家谱知识服务平台",
    "https://cdn-images-1.medium.com/max/258/1*u7oZc2_5mrkcFaxkXEyfYA@2x.png"
)
//文章：家谱的起源
val paragraphsPost1 = listOf(
    Paragraph(
        ParagraphType.Text,
        "家谱是人类以血缘为核心亲缘关系的投影，它的起源相当久远。"
    ),
    Paragraph(
        ParagraphType.Text,
        "现在人类学研究的成果已经表明：在人类进入文明社会以前，血缘关系是人类群体最初、也是最重要的纽带。" +
                "人类最初出现的群体是“榛榛狉狉、群居袭处”的原始群，此时但知其母，不知其父，纯是浑然之群。" +
                "按照古人类研究得出的结论：在人类存在的三百多万年历史中，约有二百九十万年是处在原始群时期，" +
                "到了距今十多万年时才开始产生氏族制度。浑然的原始群，开始分为若干小群，而且演进愈深，分析愈细，" +
                "辨别亲疏的族群观念也随之产生，“故人之相仁遇也，始于知生我之母。知有母，则知有与我同母之人焉。" +
                "由此而推之，则知有母之母焉；又知与有母同母之人焉。亲族之关系，盖由此而昉也。”" +
                "这也就是后来作为家谱核心和基本内容世系的萌芽。\n" +
                "血缘亲疏的辨析，族群世系的认同，应是谱牒产生的根源，口述口传的世系，正是家谱滥觞。" +
                "古有“瞽矇主诵诗，并诵世系”之说，吕思勉考证，“瞽矇之职，盖尚在小史之前。”可见了在文字家谱出现之前，" +
                "确有口述家谱的存在。我们追溯家谱产生的源头，可以发见家谱（严格地说只能是口述族群世系）、最初的功能就是" +
                "辨析亲疏，凝聚族群，优化生育，即所谓“亲亲以相及”。此后万变不离其“别”与“聚”这两个基本功能的，但随时代" +
                "推移，社会制度不同，其具体内涵和所起作用也不一样。”"
    ),
    Paragraph(
        ParagraphType.Text,
        "家谱发展及其功能嬗变的脈络，大致可分为周代、两汉、魏晋南北朝、隋唐和五代以后几个阶段:"
    ),
    Paragraph(
        ParagraphType.CodeBlock,
        "周代实行的是宗法封建制度：“宗者，尊也。为先祖主者宗人之所尊也。”《白虎通义》：“别子为祖，继别为宗，" +
                "继称者为小宗。”《礼记.大传》“族”本来只是有血缘关系的群体，并无尊卑主从之别；而进入队级社会，" +
                "便有了“宗”，也就是在亲族之中奉一人以为主，主者为尊并有特权，他死了则由宗子继承。这样，家谱别亲疏、" +
                "明统系的功能渗进了主从尊卑等为宗法封建政治服务的内容。\n" +
                "《周礼.春官》载：“小史掌邦国之志，奠系世，辨昭穆。”郑康成注云：“系世，谓帝系，《世本》之属是也，" +
                "小史主定之”。“辨昭穆者，帝系《世本》之中，皆自有昭穆亲疏，故须辨之云。”\n" +
                "由此可见：周代的家谱《世本》之类，是属于以周天子为首的周室宗族的，它所明的统系，是周宗室的帝王统系；" +
                "所辨的亲疏，是尊卑贵贱的亲疏。所以，周代的家谱完全是为推行宗法分封，巩固周王朝统治服务的。"
    ),
    Paragraph(
        ParagraphType.Text,
        "周代的宗法分封制度，经过春秋战国战火“礼崩乐坏”趋于瓦解，特别是秦王扫除六合，旧的贵族“公侯子，失其本系”" +
                "到了汉高祖刘邦“徒步有天下”，宗族组织由兴到衰，由破坏到重建，到东汉时已由世族和宗族代替了。两汉时期的" +
                "政治，基本是世族地主占统治地位，刘邦尚官，“命官以贤，诏爵以功”，君统与宗统开始分离。所以，两汉的家谱" +
                "功能是为恢复、复建宗族和形成、巩固世族的统治服务。"
    ),
    Paragraph(
        ParagraphType.Text,
        "魏晋南北朝、隋唐时期是士族政治、魏立九品中正制，“上品无寒门，下品无势族”，选官品人，婚姻嫁媾，士庶分明，" +
                "尊卑严格，“官之选举，必由簿状；家之婚姻，必由谱系”，因而维系门阀制度的家谱特别兴盛。此时的家谱成了" +
                "政府选举、士族出仕、门第婚姻的根据，同时也成为士族政治服务的工具。正因为家谱对于人们的社会地位、" +
                "发展前途、社交层次有如此重大的作用，造假的现象应运泛滥起来，由“尚官”“尚姓”至于“尚诈”，这是利益驱动" +
                "所致。 由于北方战乱频繁，大量中原人口南迁，经济中心南移，五代以后江南庶族地主势力抬头，特别是宋明清" +
                "商品货币经济的发展，城镇商业繁荣和商帮的出现，推动着社会权力的进一步下沉，士族宗族也向平民宗族发展。" +
                "五代以后“取士不问家世”，庶族知识分子可以通过科举出仕：“婚姻不问门阀”，新兴的地主、商人在社会上获得了" +
                "应有地位。家谱由于失去了以前的政治功能也由官修变为私修，内容也就更加广泛丰富，它的功能也由政治功能向" +
                "发挥社会功能的方向发展。具体地说，私修家谱通过姓氏原始、迁徙本末、世系渊源的展现，起着追根溯源、" +
                "联宗收族，维系和强化作为社会群体的宗族和家庭的作用。"
    ),
//    Paragraph(
//        ParagraphType.Header,
//        "If you cannot remove it, just rename it!"
//    ),
//
//    Paragraph(
//        ParagraphType.Text,
//        "At I/O I was lucky enough to attend the “Android Studio: Tips and Tricks” talk where Ivan Gravilovic, from Google, shared some amazing tips. One of these was a possible solution for my problem: setting a custom path for my modules.",
//        listOf(
//            Markup(
//                MarkupType.Italic,
//                41,
//                72
//            )
//        )
//    ),
//
//    Paragraph(
//        ParagraphType.Text,
//        "In this particular case our settings.gradle becomes:",
//        listOf(Markup(MarkupType.Code, 28, 43))
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        """
//        include ':app'
//        include ':module1'
//        include ':module1'
//        include ':module1'
//        include ':module1'
//        """.trimIndent()
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        """
//        // Set a custom path for the four features modules.
//        // This avoid to have an empty "features" module in  Android Studio.
//        project(":module1").projectDir=new File(rootDir, "features/module1")
//        project(":module2").projectDir=new File(rootDir, "features/module2")
//        project(":module3").projectDir=new File(rootDir, "features/module3")
//        project(":module4").projectDir=new File(rootDir, "features/module4")
//        """.trimIndent()
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "And the layout in Android Studio is now:"
//    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Conclusion"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "As the title says, this is really a small thing, but it helps keep my project in order and it shows how a small Gradle configuration can help keep your project tidy."
//    ),
//    Paragraph(
//        ParagraphType.Quote,
//        "You can find this update in the latest version of the on-demand modules codelab.",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                54,
//                79,
//                "https://codelabs.developers.google.com/codelabs/on-demand-dynamic-delivery/index.html"
//            )
//        )
//    ),
    Paragraph(
        ParagraphType.Header,
        "参考资料"
    ),
    Paragraph(
        ParagraphType.Bullet,
        "家谱的起源",
        listOf(
            Markup(
                MarkupType.Link,
                0,
                47,
                "https://jiapu.library.sh.cn/#/GenealogyCultureDetails:14137731777705802"
            )
        )
    ),

//    Paragraph(
//        ParagraphType.Bullet,
//        "On Demand module codelab",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                0,
//                24,
//                "https://codelabs.developers.google.com/codelabs/on-demand-dynamic-delivery/index.html"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Bullet,
//        "Patchwork Plaid — A modularization story",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                0,
//                40,
//                "https://medium.com/androiddevelopers/a-patchwork-plaid-monolith-to-modularized-app-60235d9f212e"
//            )
//        )
//    )
)
//文章：家谱堂号是什么
val paragraphsPost2 = listOf(
    Paragraph(
        ParagraphType.Text,
        "什么是堂号？",
        listOf(
            Markup(MarkupType.Bold, 0, 6),

        )
    ),
    Paragraph(
        ParagraphType.Text,
        "明清以来，祠堂成了宗族祭祀先祖、议决大事的重要场所。每个祠堂大凡都有自己的堂号，从某种意义上讲堂号是宗族的标志。" +
                "堂号可分为两大类：一类为具有姓氏特徵的堂号，如王氏“三槐堂”、赵氏“半部堂”等；另一类是没有姓氏特徵的堂号，" +
                "如“世德堂”、“崇本堂”等。具有姓氏特徵的堂号，其来源大都伴有寓于某些含义的典故，它重复出现于该姓氏的" +
                "不同支族。没有姓氏特徵的堂号，大部分分别为某一支族特有或与其他宗族的堂号甚少重复，其馀少量的堂号则在" +
                "同姓和异姓宗族中间着较高的重复出现率。而其他的堂号辅以姓氏、地域的限制，也能在判断宗族方面起一定的作用。" +
                "如“世德堂”，丁、王、李、吴、何、沈、邵、周、胡、秦、徐、陆、陈、孙、黄、曹、许、张等数十个姓氏都有此堂号，" +
                "而且同姓中的不同支派也有，出现的重复率极高，但加以姓氏、籍等条件限制，就可缩小范围。",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                14,
//                26,
//                "https://dagger.dev/tutorial/"
//            ),
//            Markup(MarkupType.Bold, 114, 132),
//            Markup(MarkupType.Bold, 144, 159),
//            Markup(MarkupType.Bold, 191, 198)
//        )
    ),
    Paragraph(
        ParagraphType.Text,
        "各堂的代表姓氏是什么？",
        listOf(
            Markup(MarkupType.Bold, 0, 10),

            )
    ),
    Paragraph(
        ParagraphType.Text,
        "“堂号”也叫“郡号”，郡是行政区域的建置，也是一个姓氏发祥的本源，后世深以源远流长，惧有所失，因此立“堂号”而为信。" +
                "“堂号”究竟有多少，已难确知，依据中华文化复兴运动推行委员会邀请专家研究整理，查考得到的共有八十堂，" +
                "二百六十七姓，各堂的代表姓氏及其居住地点如下：",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                58,
//                70,
//                "https://github.com/google/dagger/issues/900"
//            )
//        )
    ),
//    Paragraph(
//        ParagraphType.Header,
//        "kapt build improvements"
//    ),
    Paragraph(
        ParagraphType.Text,
        "      01、济阳堂：丁、卞、江、柯、却、陶、庾、蔡。后汉设济阴国，晋改济阳郡，在山东定陶县地。\n" +
                "　　02、西河堂：卜、林、卓、宰、靳。汉时的郡名，今绥远鄂尔多斯地方，即山西离石县。\n" +
                "　　03、河南堂：于、山、方、毛、元、平、向、利、邱、俞、陆、褚、廉、种。今河南阳县。\n" +
                "　　04、东鲁堂：孔。孔子生于鲁，地因人而名，故叫东鲁。\n" +
                "　　05、雁门堂：文、田、童、农。战国时为赵地，汉为郡，地当山西旧代州，宁武以北及朔平、大同一带。\n" +
                "　　06、陇西堂：牛、辛、李、时、彭、董。秦郡名，地当甘肃旧兰州、巩昌、秦州诸府。\n" +
                "　　07、天水堂：尹、皮、艾、狄、桂、秦、庄、赵、严、上官。汉时郡名，在甘肃渭县境，即今伏羌地。\n" +
                "　　08、平阳堂：仇、汪、巫、来、常、凤、管、卫、欧、饶。三国魏郡名，在山西临汾县境。\n" +
                "　　09、吴兴堂：水、尤、沈、明、姚、施。三国吴郡名，今浙江省吴兴地。\n" +
                "　　10、太原堂：王、羊、祁、易、武、祝、宫、温、霍、阎、尉迟。太原、汾州二府及保德、平定、忻州各地。\n" +
                "　　11、高平堂：巴、范。汉时国名，今安徽省盱贻县境。\n" +
                "　　12、南阳堂：白、束、呼、姬、许、隆、叶、翟、韩、乐、邓。秦时郡名，泛指河南省南阳及湖北襄阳一带。\n" +
                "　　13、京兆堂：申、史、宋、别、冷、杜、车、宗、段、计、韦、晁、郜、浦、象、康、舒、雍、寿、酆、黎、皇、甫。汉三辅之一，地辖长安以东至华县一带。\n" +
                "　　14、渤海堂：甘、封、高、欧阳。汉郡名，地领河北省河间、沧县、安次各地，南至山东吴棣境。\n" +
                "　　15、汝南堂：左、言、汝、周、南、殷、商、梅、廖、袁、蓝。汉郡名，地辖河南旧汝宁、陈州二府及安徽颖州府。\n" +
                "　　16、武陵堂：冉、华、龙、龚、顾。汉时郡名，今湖南省常德县地。\n" +
                "　　17、上党堂：樊、包、尚、连、鲍。秦时郡名，在山西东南部，今长子县境。\n" +
                "　　18、陈留堂：伊、阮、虞、谢。汉时郡名，晋为国，今河南陈留县，后移至开封。\n" +
                "　　19、上谷堂：成、侯、冠、荣。秦郡名，地辖保定、易州、宣化、顺天诸府，均在河北省。\n" +
                "　　20、沛国堂：朱。汉时设郡，后汉改国，在安徽宿县境。\n" +
                "　　21、晋阳堂：匡、唐、景。秦汉时县名，今山西太原地。\n" +
                "　　22、新安堂：古。三国吴郡名，在浙江省淳安县。\n" +
                "　　23、武威堂：石、安、贾。汉武帝时郡名，即甘肃省武威县地。\n" +
                "　　24、乐安堂：任。南朝宋郡名，隋癈，在山东广饶县。\n" +
                "　　25、冯翊堂：吉、雷。汉时郡名，为左冯翊辖地，即陜西大荔县地。\n" +
                "　　26、中山堂：仲、汤、蔺。春秋时国名，属北狄鲜虞国地，今河北省正定县境。\n" +
                "　　27、西平堂：池。东汉郡，今甘肃西宁县。\n" +
                "　　28、安定堂：伍、胡、席、梁、程。汉时郡名，在甘肃旧平凉、固原、泾州境。\n" +
                "　　29、东海堂：有、茅、徐。汉时置郡，地当山东兖州东南，江苏邳县以东。\n" +
                "　　30、河东堂：旅、薛、裴、储、聂。秦时郡名，即山西西夏县地。\n" +
                "　　31、下邳堂：阙。后汉时国名，即江苏邳县地。\n" +
                "　　32、延陵堂：吴。春秋时吴邑，季札受封延陵，今将苏武进县地。\n" +
                "　　33、庐江堂：河。汉时郡名，在安徽庐江县境。\n" +
                "　　34、北海堂：邢、郎。汉郡名，东汉改国，地领山东益都以东至掖县一带。\n" +
                "　　35、平陵堂：孟。春秋时齐邑，今山东历城县境。\n" +
                "　　36、彭城堂：金、刘、钱。汉郡名，今江苏铜山县地。\n" +
                "　　37、清河堂：房、傅、张。汉时郡名，地当河北清河、故城、枣强、南宫诸县及山东清平、恩县、冠县、高唐、临清、武城一带。\n" +
                "　　38、东平堂：花。汉国名，即山东省东平县。\n" +
                "　　39、博陵堂：邵。晋国名，后改郡，今河北省安平县境。\n" +
                "　　40、山阳堂：岳。汉郡名，故城在河南修武县，曹丕篡汉，废献帝为山阳公。\n" +
                "　　41、荥阳堂：昌、潘、郑。战国时韩地，今河南省荥阳、成皋一带。\n" +
                "　　42、临海堂：屈。三国吴，分会稽东部置临海，在浙江省，旧称台州。\n" +
                "　　43、范阳堂：邹、简、燕。古郡名，即今河北省涿县地。\n" +
                "　　44、齐郡堂：查、晏、覃、富、谭。汉时郡名，后改为国，今山东临淄地。\n" +
                "　　45、高阳堂：纪、耿。汉时县名，今河北省高阳县地。\n" +
                "　　46、敦煌堂：洪。汉时郡名，今甘肃西部敦煌县。\n" +
                "　　47、魏郡堂：柏。春秋时国名，在山西芮城县境。\n" +
                "　　48、扶风堂：马、班、禄、万、鲁。隋时置郡名，今陜西省扶风、凤翔一带。\n" +
                "　　49、千乘堂：倪。汉时郡名，在山东地城、益都一带。\n" +
                "　　50、会稽堂：夏。秦郡名，地当江苏东部、浙江西部，即今绍兴。\n" +
                "　　51、河内堂：荀、司马。汉郡名，地当河南省黄河与太行山之间，今武陵、沁阳一带。\n" +
                "　　52、广陵堂：贡、盛。汉国名，后改郡，今江苏都县地。\n" +
                "　　53、薛郡堂：海。秦时郡名，地辖山东西南部、江苏东北部。\n" +
                "　　54、河间堂：凌章詹。汉国名，后魏改郡，在河北献县及河间一带。\n" +
                "　　55、南昌堂：涂。汉县名，在江西南昌地，洪州涂氏为豫章望族。\n" +
                "　　56、豫章堂：罗。汉郡名，在江西南昌县地。\n" +
                "　　57、颖川堂：陈、邬、赖、锺。秦郡名，地辖河南旧许州、陈州、汝宝、汝州诸府，盖指颖水流域。\n" +
                "　　58、护国堂：逢、边、戴、稽。春秋时陈焦邑，今安徽省亳县地。\n" +
                "　　59、余杭堂：隗。隋郡名，唐复为杭州，今浙江杭县。\n" +
                "　　60、汾阳堂：郭。汉地名，唐并入阳曲，在山西省，唐将郭子仪受封于此，因而名传。\n" +
                "　　61、琅瑜堂：符、云、诸葛。秦郡名，地辖旧山东兖、音、沂、莱四府，后汉为国，在临沂县境。\n" +
                "　　62、广平堂：游、贺、谈。汉郡名，后改为国，今河北鸡泽县地。\n" +
                "　　63、江夏堂：费、黄。汉郡名，在湖北云梦境。\n" +
                "　　64、辽西堂：项。秦郡名，地辖永平、承德、朝阳、锦州、新民一带，在辽宁与河北间。\n" +
                "　　65、平原堂：东方。汉郡名，在山东旧武定、济南二府之西，及乐陵、长清一带，即平原县地。\n" +
                "　　66、顿邱堂：葛、司空。春秋卫邑，在河南省浚县。\n" +
                "　　67、弘农堂：杨。汉时郡名，在济南省灵宝县境。\n" +
                "　　68、百济堂：福。春秋时国名，在今朝鲜半岛。\n" +
                "　　69、内黄堂：骆。汉时县名，今河南省内黄县地。\n" +
                "　　70、江陵堂：熊。春秋时楚郢都，汉置县，宋改都，今湖北江陵地。\n" +
                "　　71、巨鹿堂：魏。秦郡名，晋为国，今河北巨鹿、宁晋一带。\n" +
                "　　72、兰陵堂：兰。晋时郡名，在山东峄县，南朝宋移昌卢，在滕县境。\n" +
                "　　73、解梁堂：关。春秋时晋邑，地领山西解县、临晋、虞乡诸地，后汉关羽，即解人也。\n" +
                "　　74、燕山堂：窦。辽时燕京，宋改燕山府，地领河北省北部及东北部。\n" +
                "　　75、武功堂：苏。汉郡名，在陜西郿县境，今设武功县。\n" +
                "　　76、始平堂：翁、冯、庞。晋郡名，三国魏改始平，在咸阳附近。\n" +
                "　　77、梁国堂：墨、桥。汉时梁国，后魏改郡，唐改宋州，在河南商丘县境。\n" +
                "　　78、济南堂：伏、宁。汉初置郡名，即今山东历城县境。\n" +
                "　　79、平昌堂：红、孟、管、离。三国魏置郡名，治安丘，在今山东安丘县地。\n" +
                "　　80、濮阳堂：爰。汉县名，后魏改郡，即古帝丘，在河北濮阳县及山东濮县一带。",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                99,
//                104,
//                "https://github.com/google/dagger/releases/tag/dagger-2.18"
//            ),
//            Markup(
//                MarkupType.Link,
//                143,
//                148,
//                "https://github.com/google/dagger/releases/tag/dagger-2.24"
//            ),
//            Markup(MarkupType.Bold, 53, 95)
//        )
    ),
    Paragraph(
        ParagraphType.Text,
        "堂号的意义：",
        listOf(
            Markup(MarkupType.Bold, 0, 5),
            )
//        listOf(
//            Markup(
//                MarkupType.Link,
//                92,
//                97,
//                "https://github.com/google/dagger/releases/tag/dagger-2.18"
//            ),
//            Markup(
//                MarkupType.Link,
//                165,
//                170,
//                "https://github.com/google/dagger/releases/tag/dagger-2.23"
//            )
//        )
    ),
    Paragraph(
        ParagraphType.Text,
        "堂号，本意是厅堂、居室的名称。因古代同姓族人多聚族而居，往往数世同堂，或同一姓氏的支派、分房集中居住于某一处或相近数处庭堂、宅院之中，堂号就成为某一同族人的共同徽号。同姓族人为祭祀供奉共同的祖先，在其宗祠、家庙的匾额上题写堂名，因而堂号也含有祠堂名号之含义，是表明一个家族源流世系，区分族属、支派的标记，是家族文化中用以弘扬祖德、敦宗睦族的符号标志，是寻根意识与祖先崇拜的体现。所以，堂号和郡望一样，都是中国姓氏文化中特有的范畴。也是中国人进行寻根问祖时不可不先熟悉的一个概念。\n" +
                "\n" +
                "堂号，不仅仅是用在祠堂，还多用在族谱、店铺、书斋及厅堂、礼簿等处；也有用在生活器具上的，如在斗、口袋、钱袋、灯笼等上面大书堂号，以标明姓氏及族别。凡看重自己的姓氏和族属的人，都不会忘记本族世代相传的堂号。不仅汉族，许多迁居内地的其它少数民族，如匈奴的呼延氏“太原堂”、回纥族的爱氏“西河堂”、蠕蠕族的苕氏“河内堂”等少数民族，内迁后接受了汉文化，也有以其繁衍地的郡名或祖上业绩之典故作堂号的。这就是中国人的堂号，它具有深厚的文化内涵和实际意义。\n" +
                "\n" +
                "堂号，有广义和狭义之分。广义的堂号与姓氏的地望相关，或以其姓氏的发祥祖地，或以其声名显赫的郡望所在，作为堂号，亦称“郡号”或总堂号。同一姓氏的发祥祖地和郡望不同，会有若干个郡号。如李姓郡(望)号有：陇西、赵郡、顿丘、渤海、中山、江夏、范阳、汉中、代北、鸡田、柳城等30余个；王氏有：太原、琅琊、京兆、元城、汲郡等地38个；张姓有清河、范阳、太原、京兆、南阳、中山、安定、河内等40余个。\n" +
                "\n" +

                "狭义的堂号，也称自立堂号，在同一姓氏之间，除广义的郡望之外，往往以先世之德望、功业、科第、文字或祥瑞典故，自立堂号，其形式多种多样，五花八门，不胜枚举，若按每姓一个堂号来计算的话，全国至少有数千至一万个堂号，是姓氏文化中有待开发、整理、研究的资料宝库。\n" +
                "\n" +

                "中国人是世界上最有祖先崇拜传统的一个民族。在每个家族中，往往都有一个场所来供奉已去世的祖先的神主牌位，所以，旧时的每个家族都会有本家族的祠堂，并给它取一个堂号，目的是让子孙们每提起自家的堂号，就会知道本族的来源，记起祖先的功德。\n" +
                "\n" +

                "俗话说，树大分杈。随着生命的传递、繁衍，家族就会不断扩大。扩大的结果是一些家族从祖居地迁居他处，另开基业，形成新的分支和新的宗族。这些新形成的宗族和分支，往往又会建立新的祠堂，来供奉最亲近的祖先。于是，由一个祠堂又会派生出许多新的祠堂来。因此，象族谱有总谱、支谱一样，祠堂也就有总祠、支祠、分祠之分，也就是民间所说的所谓大堂祠和小祠堂。\n" +
                "\n" +

                "历来每个姓氏、每个宗族、每个家族，都有自己的堂号。堂号的历史悠久，应用广泛，在中国宗法社会中有非常重大的意义和作用。\n" +
                "\n" +

                "从功能上说，堂号的意义主要在于区别姓氏、区分宗派，劝善惩恶，教育族人。如果说，郡望是高一级别的宗族寻根标志，那么堂号就比郡望堂低一级的宗族标志。郡望往往可以作为堂号，但堂号却大都不能用作郡望。一个姓的堂号要比郡望多得多，一姓的郡望只有数个多至数十个，但堂号往往有数百甚至上千个之多。郡望在宋代以后就开始走向统一和固定，但堂号却随着宗族的发展，一直在不断的增加。\n" +
                "\n" +

                "堂号是宗法社会的产物，在传统宗法社会中，它对于敦宗睦族，弘扬孝道，启迪后人，催人向上，维护家庭、宗族和整个社会的稳定，都具有十分重大的作用。中华人民共和国成立后，随着中国传统社会的终结，祠堂在中国大陆不是成了历史，就是成了文物，因此，新的堂号不可能再产生，但是，旧有的堂号却仍然留在各姓各族人们的记忆中。\n" +

                "\n" +
                "近年来，随着中国政府的开放改革和全球华人寻根热潮的兴起，许多大陆宗祠被恢复，族谱被续修，因此，堂号再一次被人们抬了出来。不过，今天的堂号，已经没有了宗族主义的负面作用，有的只是给人们寻根问祖、缅怀先祖、激励后人的积极意义。特别是对于加强中华民族的向心力、凝聚力，对于中华民族的大团结，堂号都必将产生巨大的促进作用。",
//        listOf(Markup(MarkupType.Code, 41, 53))
    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Alternatively, if you use Kotlin DSL script files, include them like this in the build.gradle.kts file of the modules that use Dagger:",
//        listOf(Markup(MarkupType.Code, 81, 97))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Qualifiers for field attributes"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "",
//        listOf(Markup(MarkupType.Link, 0, 0))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "When an annotation is placed on a property in Kotlin, it’s not clear whether Java will see that annotation on the field of the property or the method for that property. Setting the field: prefix on the annotation ensures that the qualifier ends up in the right place (See documentation for more details).",
//        listOf(
//            Markup(MarkupType.Code, 181, 187),
//            Markup(
//                MarkupType.Link,
//                268,
//                285,
//                "http://frogermcs.github.io/dependency-injection-with-dagger-2-custom-scopes/"
//            ),
//            Markup(MarkupType.Italic, 114, 119),
//            Markup(MarkupType.Italic, 143, 149)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "✅ The way to apply qualifiers on an injected field is:"
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        "@Inject @field:MinimumBalance lateinit var minimumBalance: BigDecimal",
//        listOf(Markup(MarkupType.Bold, 8, 29))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "❌ As opposed to:"
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        """
//        @Inject @MinimumBalance lateinit var minimumBalance: BigDecimal
//        // @MinimumBalance is ignored!
//        """.trimIndent(),
//        listOf(Markup(MarkupType.Bold, 65, 95))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Forgetting to add field: could lead to injecting the wrong object if there’s an unqualified instance of that type available in the Dagger graph.",
//        listOf(Markup(MarkupType.Code, 18, 24))
//    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Static @Provides functions optimization"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Dagger’s generated code will be more performant if @Provides methods are static. To achieve this in Kotlin, use a Kotlin object instead of a class and annotate your methods with @JvmStatic. This is a best practice that you should follow as much as possible.",
//        listOf(
//            Markup(MarkupType.Code, 51, 60),
//            Markup(MarkupType.Code, 73, 79),
//            Markup(MarkupType.Code, 121, 127),
//            Markup(MarkupType.Code, 141, 146),
//            Markup(MarkupType.Code, 178, 188),
//            Markup(MarkupType.Bold, 200, 213),
//            Markup(MarkupType.Italic, 200, 213)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "In case you need an abstract method, you’ll need to add the @JvmStatic method to a companion object and annotate it with @Module too.",
//        listOf(
//            Markup(MarkupType.Code, 60, 70),
//            Markup(MarkupType.Code, 121, 128)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Alternatively, you can extract the object module out and include it in the abstract one:"
//    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Injecting Generics"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Kotlin compiles generics with wildcards to make Kotlin APIs work with Java. These are generated when a type appears as a parameter (more info here) or as fields. For example, a Kotlin List<Foo> parameter shows up as List<? super Foo> in Java.",
//        listOf(
//            Markup(MarkupType.Code, 184, 193),
//            Markup(MarkupType.Code, 216, 233),
//            Markup(
//                MarkupType.Link,
//                132,
//                146,
//                "https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html#variant-generics"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "This causes problems with Dagger because it expects an exact (aka invariant) type match. Using @JvmSuppressWildcards will ensure that Dagger sees the type without wildcards.",
//        listOf(
//            Markup(MarkupType.Code, 95, 116),
//            Markup(
//                MarkupType.Link,
//                66,
//                75,
//                "https://en.wikipedia.org/wiki/Class_invariant"
//            ),
//            Markup(
//                MarkupType.Link,
//                96,
//                116,
//                "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-suppress-wildcards/index.html"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "This is a common issue when you inject collections using Dagger’s multibinding feature, for example:",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                57,
//                86,
//                "https://dagger.dev/multibindings.html"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        """
//        class MyVMFactory @Inject constructor(
//          private val vmMap: Map<String, @JvmSuppressWildcards Provider<ViewModel>>
//        ) {
//            ...
//        }
//        """.trimIndent(),
//        listOf(Markup(MarkupType.Bold, 72, 93))
//    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Inline method bodies"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Dagger determines the types that are configured by @Provides methods by inspecting the return type. Specifying the return type in Kotlin functions is optional and even the IDE sometimes encourages you to refactor your code to have inline method bodies that hide the return type declaration.",
//        listOf(Markup(MarkupType.Code, 51, 60))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "This can lead to bugs if the inferred type is different from the one you meant. Let’s see some examples:"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "If you want to add a specific type to the graph, inlining works as expected. See the different ways to do the same in Kotlin:"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "If you want to provide an implementation of an interface, then you must explicitly specify the return type. Not doing it can lead to problems and bugs:"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Dagger mostly works with Kotlin out of the box. However, you have to watch out for a few things just to make sure you’re doing what you really mean to do: @field: for qualifiers on field attributes, inline method bodies, and @JvmSuppressWildcards when injecting collections.",
//        listOf(
//            Markup(MarkupType.Code, 155, 162),
//            Markup(MarkupType.Code, 225, 246)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Dagger optimizations come with no cost, add them and follow best practices to improve your build time: enabling incremental annotation processing, disabling formatting and using static @Provides methods in your Dagger modules.",
//        listOf(
//            Markup(
//                MarkupType.Code,
//                185,
//                194
//            )
//        )
//    )
)
//文章：堂号的类别和特色
val paragraphsPost3 = listOf(
    Paragraph(
        ParagraphType.Text,
        "现依据各姓氏堂号的来历、特色、分为几大类型：",
        listOf(Markup(MarkupType.Bold, 0, 22),)
//        listOf(
//            Markup(
//                MarkupType.Link,
//                151,
//                172,
//                "https://codelabs.developers.google.com/codelabs/java-to-kotlin/#0"
//            ),
//            Markup(
//                MarkupType.Link,
//                209,
//                216,
//                "https://clmirror.storage.googleapis.com/codelabs/java-to-kotlin-zh/index.html#0"
//            ),
//            Markup(
//                MarkupType.Link,
//                226,
//                246,
//                "https://codelabs.developers.google.com/codelabs/java-to-kotlin-pt-br/#0"
//            )
//        )
    ),
    Paragraph(
        ParagraphType.Text,
        "以血缘关系命名堂号\n" +

                "中国的姓氏文化，首先表现出来的社会心态就是对血缘关系的高度重视，不仅同一姓氏使用相同的(一个或若干)堂号，而且有血缘关系的不同姓氏，也会使用同一堂号。如著名的“六桂堂”，是闽粤一带洪、江、汪、龚、翁、方六个姓氏共同的一个堂号。据文献记载，这六个南方家族，虽然姓氏不同，但却是一个先祖所同一家族，追本溯源都是翁姓的后裔。",
        listOf(Markup(MarkupType.Link, 0, 8),)
        //        listOf(
//            Markup(
//                MarkupType.Link,
//                105,
//                124,
//                "https://www.jetbrains.com/help/idea/converting-a-java-file-to-kotlin-file.html"
//            )
//        )
    ),
    Paragraph(
        ParagraphType.Text,
        "以地域命名堂号:\n" +
                "\n" +

                "地域观念命名的堂号，最为普遍，往往和各姓氏的郡望相关，也就是以郡号或地名作为堂号。如前述之陇西李、赵郡李、中山李，太原王、琅琊王、京兆王、清河张、安定张、河内张等皆是其例。再如诸葛氏，系出葛伯，望于琅琊，发祥地是山东诸城，后世遍布全国各地的诸葛氏，绝大多数都世代沿用琅琊的堂名。此外，如海氏的“薛郡堂”、陈氏的“颖川堂”、徐氏的“东海堂”、欧阳氏的“渤海堂”，以及呼延氏的“太原堂”、林氏的“西河堂”等，都是以地望为堂号。\n" +
                "\n" +

                "以先世的嘉言懿行为堂号:\n" +
                "\n" +
                "\n" +
                "中国人向有慎终追远的美德，往往以先世祖宗的嘉宗懿行深感自豪，往往以此命名堂号，千古留芳。如弘农杨氏“四知堂”、“清白堂”即是以东汉太尉杨震的美德作为堂号。据文献记载，杨震为东莱太守时，道经昌邑，县令王密深夜求见，以黄金十斤贿赂杨震。杨震严词拒绝说：作为故人知交，我对您是了解的，而您怎么对我的人品不了解呢？王密说：我深夜而来，无人知道这回事情。杨震回答说：此事天知、神知、我知，子知，怎能说是无人知晓？王密只好羞愧而退。杨氏后代子孙为尊崇和怀念这位拒腐蚀，不受贿的先祖杨震，便以“四知堂”，“清白堂”为堂号。\n" +
                "\n" +

                "而范氏“麦舟堂”则是来自北宋名臣范仲淹济危扶困的典故。有次范仲淹遣子纯仁，至姑苏运麦，舟至丹阳，遇石曼卿无资葬亲，纯仁即以麦船相赠。纯仁回家后告知其父，深得范仲淹嘉许。故后世以此为典，以“麦舟堂”为堂号。\n" +
                "\n" +

                "以祖上的功业勋绩为堂号\n" +
                "\n" +
                "\n" +
                "在中华民族五千年的历史长河中，各个姓氏在不同历史时期，都涌现出一批功勋卓著，名垂青史的历史人物，后人往往以此作为堂号。如东汉名将马援，战功卓著，名闻遐迩，“马革裹尸”便是脍炙人口的历史典故。后因功封“伏波将军”，马氏后人中有一支便以“伏波堂”为堂号。楚大夫屈原曾任三闾大夫，屈氏遂以“三闾堂”为堂号。\n" +
                "\n" +
                "再如唐代宗时郭子仪，因平安史之乱，屡立战功，出将入相二十余年，是维系李唐王室的功勋大臣，被封为“汾阳王”。其后子孙繁衍遍布各地，多以“汾阳堂”为堂号。至今海内外郭氏子孙，也多以“汾阳郭氏”为荣。\n" +
                "\n" +

                "以传统伦理规范为堂号\n" +
                "在封建宗法社会，各个家族常以传统的伦理道德规范为堂号，以劝戒训勉后代子孙。如李氏“敦伦堂”、张氏“百忍堂”、朱氏“格言堂”、任氏“五知堂”、刘氏“百忍堂”、朱氏“格言堂”、任氏“五知堂”、刘氏“重德堂”、郑氏“务本堂”、周氏“忠信堂”、蔡氏“克慎堂”、许氏“居廉堂”等，都体现了传统的伦理道德观念。在各氏自立堂号中，十分普遍。\n" +
                "\n" +
                "如唐代郓州寿张人张公芝，九世同居，麟德年间唐高宗祭祀泰山，路过郓州，至其家，问何以能九世同居，安然相处。张公芝于纸上连书百余“忍”字，道出其中诀窍全在于百事忍让。故名之为“百忍堂”。\n" +
                "\n" +

                "以祖上情操雅量、高风亮节为堂号\n" +
                "在封建社会中，有一批文人学士，才气横溢，品格清高，深为世人所推重。其后代族人也引以为荣。\n" +
                "\n" +
                "如宋代著名理学家周敦颐，品格高雅，酷爱莲花出淤泥而不染的清高品格，以所居之处为“爱莲堂”。其后人遂以此为堂号。晋代陶渊明因不肯为五斗米折腰，遂辞官归里，赋“归去来辞”以明其志。因陶渊明号五柳先生，其后人以“五柳堂”为堂号。再如唐代大诗人李白，自号“青莲居士”，李氏族人中遂有“青莲堂”堂号。\n" +
                "\n" +

                "以祥瑞吉兆为堂号\n" +
                "古代人对祥符瑞兆十分重视，常认为是上天预示吉祥的征兆，往往以之为本族堂号。如宋代王礻右曾的手植三槐于庭院，言其子孙必有位居三公者(古代百官朝会，三公对槐树而立，故以三槐象征三公)，其子王曰果然位列宰相，当政十余年，深为朝廷寄重。其后人便以“三槐堂”为堂号，成为中国王姓中名人辈出的名门望族，与太原王氏，琅琊王氏并列为王氏三大支派。\n" +
                "\n" +

                "以先世名人的厅堂别墅为堂号\n" +
                "为表示对同姓先世名人的仰慕之情，各姓中以其厅堂，居处为堂号。唐代大诗人白居易，晚年隐居洛阳香山，号香山居士，其后人便以“香山堂”为堂号。\n" +
                "\n" +
                "再如唐代宰相裴度，以宦官当权，时事已不可为，乃自请罢相，在洛阳午格创建别墅，起浩凉亭暑馆，植花木万株，绿荫如盖，名为“绿野堂”。裴氏一支遂有“绿野堂”之堂号。\n" +
                "\n" +

                "以家族中科举功名为堂号\n" +
                "在封建社会，一些名门望族人才辈出，科第连绵，为世人称羡，遂以之为堂号。如唐代泉州人林披，有子九人，俱官居刺史(俗称州牧)，门庭显赫，世人敬仰，这支林氏遂以“九牧堂”为其堂号。再如宋人临湘人徐伟事迹至孝，隐居教授于龙潭山中，有子八人，后皆知名，时称“徐氏八龙”，后人即以“八龙堂”为其堂号。\n" +
                "\n" +

                "以垂戒训勉后人的格言礼教为堂号\n" +
                "此类堂号在各姓氏自立堂号中较为普遍。如“承志堂”、“务本堂”、“孝思堂”、“孝义堂”、“世耕堂”、“笃信堂”、“敦伦堂”、“克勤堂”等等。\n" +
                "\n" +

                "以良好祝愿为家族堂号\n" +
                "此类堂号也较为常见。如“安乐堂”、“安庆堂”、“绍先堂”、“垂裕堂”、“启后堂”等。\n" +
                "\n" +

                "以封爵、谥号或旌表褒奖为堂号\n" +
                "\n" +
                "此类堂号为历代朝廷或地方政府封赏、恩赐、旌表而来。如“忠武堂”、“忠敏堂”、“节孝堂”、“孝义堂”等等。",
//        listOf(
//            Markup(MarkupType.Code, 26, 30),
//            Markup(MarkupType.Code, 37, 47)
//        )
    ),
    Paragraph(
        ParagraphType.Text,
        "总之，堂号作为家族的徽号和别称，不仅有明显的地域特征和血缘内涵，而且带有浓厚的封建宗法色彩，既是对某一姓氏家族特色的高度概况，也是当时社会形态的反映。同样具有区分宗支族别，血缘亲疏的社会功能。它的产生、发展，多与修族谱、建宗祠、祭祀祖先、宗亲联谊活动同时进行。",
//        listOf(
//            Markup(MarkupType.Code, 245, 251),
//            Markup(MarkupType.Code, 359, 365),
//            Markup(
//                MarkupType.Link,
//                4,
//                25,
//                "https://codelabs.developers.google.com/codelabs/java-to-kotlin/#0"
//            )
//        )
    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Thanks to Walmyr Carvalho and Nelson Glauber for translating the codelab in Brazilian Portuguese!",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                21,
//                42,
//                "https://codelabs.developers.google.com/codelabs/java-to-kotlin/#0"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                76,
//                96,
//                "https://codelabs.developers.google.com/codelabs/java-to-kotlin-pt-br/#0"
//            )
//        )
//    )
)
//文章：如何考证家谱真伪
val paragraphsPost4 = listOf(
    Paragraph(
        ParagraphType.Text,
        "在过去家谱被压在箱底秘而不示，只流传于家族内部，世系上的虚构也罢，人物事迹上的造作也罢，这只要族人认可就行。我想现在随着时代的变迁，观念的更新，家谱“以补正史之不足”的功能日益凸显。它不但是一部人类生命繁衍史，更应该是一部如实反应基层百姓生活史实的百科全书。"
    ),
    Paragraph(
        ParagraphType.Text,
        "为了能使它真正的和正史、方志一道构成中华历史文化的三大支柱，也为了社会计为了子孙计，所以我们今天在修谱时，理应加以认真考证，把历史真实的学术价值与“经世致用”的社会价值放在首位。那怎么来考证家谱世系真伪呢？可以从以下方面着手：\n" +
                "\n" +
                "1、将谱中所列人物特别是同一时代并且同名者的生平履历及其后裔状况一一考证，再对照与正史所载的生平状况看是否有出入。\n" +
                "\n" +
                "2、将历代世系作世代平均年率的计算分析，看是否符合的繁衍的生理规律。\n" +
                "\n" +
                "3、查对同宗分支的异地谱载看有无不同，分析其原因作出科学判断。\n" +
                "\n" +
                "4、综合历史背景地理环境及生活习俗、口头传说等因素来分析家族迁徙路线和大致时间，以佐证世系的正确与否。\n" +
                "\n" +
                "对于自己的考证拿不准或难下结纶的可以把自己考证的过程和观点写成文章罗列于后，供后人进一步去探讨，别急于轻易地下结论。",
//        listOf(
//            Markup(
//                MarkupType.Bold,
//                183,
//                197
//            )
//        )
    ),
//    Paragraph(
//        ParagraphType.Text,
//        "AndroidViewModel is a subclass of ViewModel that is aware of the Application context. However, having access to a context can be dangerous if you’re not observing or reacting to the lifecycle of that context. The recommended practice is to avoid dealing with objects that have a lifecycle in ViewModels.",
//        listOf(
//            Markup(MarkupType.Code, 0, 16),
//            Markup(MarkupType.Code, 34, 43),
//            Markup(MarkupType.Bold, 209, 303)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Let’s look at an example based on this issue in the tracker: Updating ViewModel on system locale change.",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                61,
//                103,
//                "https://issuetracker.google.com/issues/111961971"
//            ),
//            Markup(MarkupType.Italic, 61, 104)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "The problem is that the string is resolved in the constructor only once. If there’s a locale change, the ViewModel won’t be recreated. This will result in our app showing obsolete data and therefore being only partially localized.",
//        listOf(Markup(MarkupType.Bold, 73, 133))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "As Sergey points out in the comments to the issue, the recommended approach is to expose the ID of the resource you want to load and do so in the view. As the view (activity, fragment, etc.) is lifecycle-aware it will be recreated after a configuration change so the resource will be reloaded correctly.",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                3,
//                9,
//                "https://twitter.com/ZelenetS"
//            ),
//            Markup(
//                MarkupType.Link,
//                28,
//                36,
//                "https://issuetracker.google.com/issues/111961971#comment2"
//            ),
//            Markup(MarkupType.Bold, 82, 150)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Even if you don’t plan to localize your app, it makes testing much easier and cleans up your ViewModel objects so there’s no reason not to future-proof."
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "We fixed this issue in the android-architecture repository in the Java and Kotlin branches and we offloaded resource loading to the Data Binding layout.",
//        listOf(
//            Markup(
//                MarkupType.Link,
//                66,
//                70,
//                "https://github.com/googlesamples/android-architecture/pull/631"
//            ),
//            Markup(
//                MarkupType.Link,
//                75,
//                81,
//                "https://github.com/googlesamples/android-architecture/pull/635"
//            ),
//            Markup(
//                MarkupType.Link,
//                128,
//                151,
//                "https://github.com/googlesamples/android-architecture/pull/635/files#diff-7eb5d85ec3ea4e05ecddb7dc8ae20aa1R62"
//            )
//        )
//    )
)
//马氏家谱
val paragraphsPost5 = listOf(
    Paragraph(
        ParagraphType.Text,
        "西汉《急就章》列为汉代常见姓氏之一。汉代有马武，湖阳人，为刘秀部将。大司徒马宫，本为马矢氏，改马氏，见《汉书·马宫传》所载。东汉有马融，茂陵人，文学家。金代有马庆祥，西域人。元代有马致远，大都人，戏剧家。清代有马建忠，丹徒人。《中国人名大辞典》收录马氏328例。宋《百家姓》列为第052姓。",
//        listOf(
//            Markup(MarkupType.Code, 210, 220),
//            Markup(MarkupType.Code, 241, 249),
//            Markup(
//                MarkupType.Link,
//                210,
//                221,
//                "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html"
//            ),
//            Markup(
//                MarkupType.Link,
//                241,
//                250,
//                "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/index.html"
//            ),
//            Markup(MarkupType.Bold, 130, 134),
//            Markup(MarkupType.Bold, 195, 202),
//            Markup(MarkupType.Bold, 227, 233),
//            Markup(MarkupType.Italic, 130, 134)
//        )
    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Collections vs sequences"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "The difference between eager and lazy evaluation lies in when each transformation on the collection is performed.",
//        listOf(
//            Markup(
//                MarkupType.Italic,
//                57,
//                61
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Collections are eagerly evaluated — each operation is performed when it’s called and the result of the operation is stored in a new collection. The transformations on collections are inline functions. For example, looking at how map is implemented, we can see that it’s an inline function, that creates a new ArrayList:",
//        listOf(
//            Markup(MarkupType.Code, 229, 232),
//            Markup(MarkupType.Code, 273, 279),
//            Markup(MarkupType.Code, 309, 318),
//            Markup(
//                MarkupType.Link,
//                183,
//                199,
//                "https://kotlinlang.org/docs/reference/inline-functions.html"
//            ),
//            Markup(
//                MarkupType.Link,
//                229,
//                232,
//                "https://github.com/JetBrains/kotlin/blob/master/libraries/stdlib/common/src/generated/_Collections.kt#L1312"
//            ),
//            Markup(MarkupType.Bold, 0, 12),
//            Markup(MarkupType.Italic, 16, 23)
//        )
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        "public inline fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R> {\n" +
//            "  return mapTo(ArrayList<R>(collectionSizeOrDefault(10)), transform)\n" +
//            "}",
//        listOf(
//            Markup(MarkupType.Bold, 7, 13),
//            Markup(MarkupType.Bold, 88, 97)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Sequences are lazily evaluated. They have two types of operations: intermediate and terminal. Intermediate operations are not performed on the spot; they’re just stored. Only when a terminal operation is called, the intermediate operations are triggered on each element in a row and finally, the terminal operation is applied. Intermediate operations (like map, distinct, groupBy etc) return another sequence whereas terminal operations (like first, toList, count etc) don’t.",
//        listOf(
//            Markup(MarkupType.Code, 357, 360),
//            Markup(MarkupType.Code, 362, 370),
//            Markup(MarkupType.Code, 372, 379),
//            Markup(MarkupType.Code, 443, 448),
//            Markup(MarkupType.Code, 450, 456),
//            Markup(MarkupType.Code, 458, 463),
//            Markup(MarkupType.Bold, 0, 9),
//            Markup(MarkupType.Bold, 67, 79),
//            Markup(MarkupType.Bold, 84, 92),
//            Markup(MarkupType.Bold, 254, 269),
//            Markup(MarkupType.Italic, 14, 20)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Sequences don’t hold a reference to the items of the collection. They’re created based on the iterator of the original collection and keep a reference to all the intermediate operations that need to be performed."
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Unlike transformations on collections, intermediate transformations on sequences are not inline functions — inline functions cannot be stored and sequences need to store them. Looking at how an intermediate operation like map is implemented, we can see that the transform function is kept in a new instance of a Sequence:",
//        listOf(
//            Markup(MarkupType.Code, 222, 225),
//            Markup(MarkupType.Code, 312, 320),
//            Markup(
//                MarkupType.Link,
//                222,
//                225,
//                "https://github.com/JetBrains/kotlin/blob/master/libraries/stdlib/common/src/generated/_Sequences.kt#L860"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        "public fun <T, R> Sequence<T>.map(transform: (T) -> R): Sequence<R>{      \n" +
//            "   return TransformingSequence(this, transform)\n" +
//            "}",
//        listOf(Markup(MarkupType.Bold, 85, 105))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "A terminal operation, like first, iterates through the elements of the sequence until the predicate condition is matched.",
//        listOf(
//            Markup(MarkupType.Code, 27, 32),
//            Markup(
//                MarkupType.Link,
//                27,
//                32,
//                "https://github.com/JetBrains/kotlin/blob/master/libraries/stdlib/common/src/generated/_Sequences.kt#L117"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        "public inline fun <T> Sequence<T>.first(predicate: (T) -> Boolean): T {\n" +
//            "   for (element in this) if (predicate(element)) return element\n" +
//            "   throw NoSuchElementException(“Sequence contains no element matching the predicate.”)\n" +
//            "}"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "If we look at how a sequence like TransformingSequence (used in the map above) is implemented, we’ll see that when next is called on the sequence iterator, the transformation stored is also applied.",
//        listOf(
//            Markup(MarkupType.Code, 34, 54),
//            Markup(MarkupType.Code, 68, 71)
//        )
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        "internal class TransformingIndexedSequence<T, R> \n" +
//            "constructor(private val sequence: Sequence<T>, private val transformer: (Int, T) -> R) : Sequence<R> {",
//        listOf(
//            Markup(
//                MarkupType.Bold,
//                109,
//                120
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.CodeBlock,
//        "override fun iterator(): Iterator<R> = object : Iterator<R> {\n" +
//            "   …\n" +
//            "   override fun next(): R {\n" +
//            "     return transformer(checkIndexOverflow(index++), iterator.next())\n" +
//            "   }\n" +
//            "   …\n" +
//            "}",
//        listOf(
//            Markup(MarkupType.Bold, 83, 89),
//            Markup(MarkupType.Bold, 107, 118)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Independent on whether you’re using collections or sequences, the Kotlin Standard Library offers quite a wide range of operations for both, like find, filter, groupBy and others. Make sure you check them out, before implementing your own version of these.",
//        listOf(
//            Markup(MarkupType.Code, 145, 149),
//            Markup(MarkupType.Code, 151, 157),
//            Markup(MarkupType.Code, 159, 166),
//            Markup(
//                MarkupType.Link,
//                193,
//                207,
//                "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/#functions"
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Collections and sequences"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Let’s say that we have a list of objects of different shapes. We want to make the shapes yellow and then take the first square shape."
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Let’s see how and when each operation is applied for collections and when for sequences"
//    ),
//    Paragraph(
//        ParagraphType.Subhead,
//        "Collections"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "map is called — a new ArrayList is created. We iterate through all items of the initial collection, transform it by copying the original object and changing the color, then add it to the new list.",
//        listOf(Markup(MarkupType.Code, 0, 3))
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "first is called — we iterate through each item until the first square is found",
//        listOf(Markup(MarkupType.Code, 0, 5))
//    ),
//    Paragraph(
//        ParagraphType.Subhead,
//        "Sequences"
//    ),
//    Paragraph(
//        ParagraphType.Bullet,
//        "asSequence — a sequence is created based on the Iterator of the original collection",
//        listOf(Markup(MarkupType.Code, 0, 10))
//    ),
//    Paragraph(
//        ParagraphType.Bullet,
//        "map is called — the transformation is added to the list of operations needed to be performed by the sequence but the operation is NOT performed",
//        listOf(
//            Markup(MarkupType.Code, 0, 3),
//            Markup(MarkupType.Bold, 130, 133)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Bullet,
//        "first is called — this is a terminal operation, so, all the intermediate operations are triggered, on each element of the collection. We iterate through the initial collection applying map and then first on each of them. Since the condition from first is satisfied by the 2nd element, then we no longer apply the map on the rest of the collection.",
//        listOf(Markup(MarkupType.Code, 0, 5))
//    ),
//
//    Paragraph(
//        ParagraphType.Text,
//        "When working with sequences no intermediate collection is created and since items are evaluated one by one, map is only performed on some of the inputs."
//    ),
//    Paragraph(
//        ParagraphType.Header,
//        "Performance"
//    ),
//    Paragraph(
//        ParagraphType.Subhead,
//        "Order of transformations"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Independent of whether you’re using collections or sequences, the order of transformations matters. In the example above, first doesn’t need to happen after map since it’s not a consequence of the map transformation. If we reverse the order of our business logic and call first on the collection and then transform the result, then we only create one new object — the yellow square. When using sequences — we avoid creating 2 new objects, when using collections, we avoid creating an entire new list.",
//        listOf(
//            Markup(MarkupType.Code, 122, 127),
//            Markup(MarkupType.Code, 157, 160),
//            Markup(MarkupType.Code, 197, 200)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Because terminal operations can finish processing early, and intermediate operations are evaluated lazily, sequences can, in some cases, help you avoid doing unnecessary work compared to collections. Make sure you always check the order of the transformations and the dependencies between them!"
//    ),
//    Paragraph(
//        ParagraphType.Subhead,
//        "Inlining and large data sets consequences"
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Collection operations use inline functions, so the bytecode of the operation, together with the bytecode of the lambda passed to it will be inlined. Sequences don’t use inline functions, therefore, new Function objects are created for each operation.",
//        listOf(
//            Markup(
//                MarkupType.Code,
//                202,
//                210
//            )
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "On the other hand, collections create a new list for every transformation while sequences just keep a reference to the transformation function."
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "When working with small collections, with 1–2 operators, these differences don’t have big implications so working with collections should be ok. But, when working with large lists the intermediate collection creation can become expensive; in such cases, use sequences.",
//        listOf(
//            Markup(MarkupType.Bold, 18, 35),
//            Markup(MarkupType.Bold, 119, 130),
//            Markup(MarkupType.Bold, 168, 179),
//            Markup(MarkupType.Bold, 258, 267)
//        )
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Unfortunately, I’m not aware of any benchmarking study done that would help us get a better understanding on how the performance of collections vs sequences is affected with different sizes of collections or operation chains."
//    ),
//    Paragraph(
//        ParagraphType.Text,
//        "Collections eagerly evaluate your data while sequences do so lazily. Depending on the size of your data, pick the one that fits best: collections — for small lists or sequences — for larger ones, and pay attention to the order of the transformations."
//    )
)

val post1 = Post(
    id = "dc523f0ed25c",
    title = "家谱的起源",
    subtitle = "家谱发展及其功能嬗变的脈络，大致可分为周代、两汉、魏晋南北朝、隋唐和五代以后几个阶段。 ",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    publication = publication,
    metadata = Metadata(
        author = pietro,
        date = "2023-08-02",
        readTimeMinutes = 4
    ),
    paragraphs = paragraphsPost1,
    imageId = R.drawable.connection,
    imageThumbId = R.drawable.familytree
)

val post2 = Post(
    id = "7446d8dfd7dc",
    title = "家谱堂号是什么",
    subtitle = "堂号有什么意义，每个姓氏的堂号是什么",
    url = "https://medium.com/androiddevelopers/dagger-in-kotlin-gotchas-and-optimizations-7446d8dfd7dc",
    publication = publication,
    metadata = Metadata(
        author = manuel,
        date = "2023-06-30",
        readTimeMinutes = 5
    ),
    paragraphs = paragraphsPost2,
    imageId = R.drawable.ancestral_hall,
    imageThumbId = R.drawable.ancestral_hall2
)

val post3 = Post(
    id = "ac552dcc1741",
    title = "堂号的类别和特色",
    subtitle = "各姓氏堂号如何命名",
    url = "https://medium.com/androiddevelopers/from-java-programming-language-to-kotlin-the-idiomatic-way-ac552dcc1741",
    publication = publication,
    metadata = Metadata(
        author = florina,
        date = "2023-07-09",
        readTimeMinutes = 5
    ),
    paragraphs = paragraphsPost3,
    imageId = R.drawable.ancestral_hall4,
    imageThumbId = R.drawable.record_brush
)

val post4 = Post(
    id = "84eb677660d9",
    title = "如何考证家谱真伪",
    subtitle = "家谱不但是一部人类生命繁衍史，更应该是一部如实反应基层百姓生活史实的百科全书。",
    url = "https://medium.com/androiddevelopers/locale-changes-and-the-androidviewmodel-antipattern-84eb677660d9",
    publication = publication,
    metadata = Metadata(
        author = jose,
        date = "2023-04-02",
        readTimeMinutes = 1
    ),
    paragraphs = paragraphsPost4,
    imageId = R.drawable.check,
    imageThumbId = R.drawable.trueorfalse
)

val post5 = Post(
    id = "55db18283aca",
    title = "马氏家谱",
    subtitle = "马：汉代常见姓氏之一",
    url = "https://medium.com/androiddevelopers/collections-and-sequences-in-kotlin-55db18283aca",
    publication = publication,
    metadata = Metadata(
        author = florina,
        date = "2023-07-24",
        readTimeMinutes = 1
    ),
    paragraphs = paragraphsPost5,
    imageId = R.drawable.horse,
    imageThumbId = R.drawable.horse_blue
)

val posts: PostsFeed =
    PostsFeed(
        highlightedPost = post1,
        recommendedPosts = listOf( post2, post3, post4, post5),
        popularPosts = listOf(
            post5,
            post1.copy(id = "post6"),
            post2.copy(id = "post7")
        ),
        recentPosts = listOf(
            post3.copy(id = "post8"),
            post4.copy(id = "post9"),
            post5.copy(id = "post10")
        )
    )
