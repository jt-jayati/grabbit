/**
 * Copyright 2015 Time Warner Cable, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle

import spock.lang.Specification

class VersionSpec extends Specification {

    def versionWhenSnapshot(){
        when:
        Version version = new Version("Test-SNAPSHOT")
        then:
        version.thisVersion == "Test-"+ version.getTimestamp()
    }

    def defaultVesrsion(){
        when:
        Version version = new Version("1.0.5")
        then:
        version.thisVersion == "1.0.5"
    }

}