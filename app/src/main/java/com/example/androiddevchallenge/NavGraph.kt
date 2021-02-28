/*
 * Copyright 2021 The Android Open Source Project
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
package com.example.androiddevchallenge

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

object Destinations {
    const val PuppyList = "puppyList"
    const val PuppyDetail = "puppyDetail"

    object PuppyDetailArgs {
        const val PuppyId = "puppyId"
    }
}

class Actions(navController: NavHostController) {
    val openPuppyDetail: (Int) -> Unit = { puppyId ->
        navController.navigate("${Destinations.PuppyDetail}/$puppyId")
    }
    val navigateBack: () -> Unit = {
        navController.popBackStack()
    }
}
