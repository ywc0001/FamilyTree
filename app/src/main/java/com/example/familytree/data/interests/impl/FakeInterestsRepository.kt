/*
 * Copyright 2020 The Android Open Source Project
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

package com.example.familytree.data.interests.impl

import com.example.familytree.data.Result
import com.example.familytree.data.interests.InterestSection
import com.example.familytree.data.interests.InterestsRepository
import com.example.familytree.data.interests.TopicSelection
import com.example.familytree.utils.addOrRemove
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

/**
 * Implementation of InterestRepository that returns a hardcoded list of
 * topics, people and publications synchronously.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class FakeInterestsRepository : InterestsRepository {

    private val topics by lazy {
        listOf(
            InterestSection("家谱文化", listOf("家规家训", "迁徙图", "数字展览")),
//            InterestSection(
//                "Programming",
//                listOf("Kotlin", "Declarative UIs", "Java", "Unidirectional Data Flow", "C++")
//            ),
//            InterestSection("Technology", listOf("Pixel", "Google"))
        )
    }

    private val people by lazy {
        listOf(
            "包维秀",
            "白开宗",
            "鲍渊",
            "陈君闻",
            "邓兴梁",
            "佴湛",
            "方侪",
            "高念二郎",
            "黄渊",
            "蒋晋",
            "孔父嘉",
            "李克俊",
            "马武",
            "倪萌",
            "欧阳政"
        )
    }

    private val publications by lazy {
        listOf(
            "徐氏族谱[上海松江]",
            "诸葛氏族谱[浙江兰溪]",
            "柳湖田氏族谱[江苏镇江}",
            "顾氏汇集宗谱[上海崇明]",
            "汪氏家乘[江苏常州]",
            "长沙易氏支谱[湖南长沙]",
            "上海叶氏支谱[上海]",
            "宜春慈化汤氏族谱[江西宜春]",
            "钱氏三修族谱[湖南]",
            "平氏宗谱[浙江绍兴]"
        )
    }

    // for now, keep the selections in memory
    private val selectedTopics = MutableStateFlow(setOf<TopicSelection>())
    private val selectedPeople = MutableStateFlow(setOf<String>())
    private val selectedPublications = MutableStateFlow(setOf<String>())

    override suspend fun getTopics(): Result<List<InterestSection>> {
        return Result.Success(topics)
    }

    override suspend fun getPeople(): Result<List<String>> {
        return Result.Success(people)
    }

    override suspend fun getPublications(): Result<List<String>> {
        return Result.Success(publications)
    }

    override suspend fun toggleTopicSelection(topic: TopicSelection) {
        selectedTopics.update {
            it.addOrRemove(topic)
        }
    }

    override suspend fun togglePersonSelected(person: String) {
        selectedPeople.update {
            it.addOrRemove(person)
        }
    }

    override suspend fun togglePublicationSelected(publication: String) {
        selectedPublications.update {
            it.addOrRemove(publication)
        }
    }

    override fun observeTopicsSelected(): Flow<Set<TopicSelection>> = selectedTopics

    override fun observePeopleSelected(): Flow<Set<String>> = selectedPeople

    override fun observePublicationSelected(): Flow<Set<String>> = selectedPublications
}
