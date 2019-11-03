/*
 * Copyright 2018 - 2019 Volker Berlin (i-net software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.inetsoftware.jwebassembly.wasm;

/**
 * Interface of all possible types in WebAssembly. This are predefined (native) types and custom types in the type section.
 * <pre><code>
 * numtype ::= i32 | i64 | f32 | f64
 * packedtype ::= i8 | i16
 * reftype ::= anyref | funcref | nullref
 * valtype ::= numtype | reftype
 * deftype ::= functype | structtype | arraytype
 * 
 * storagetype ::= valtype | packedtype
 * </code></pre>
 * @author Volker Berlin
 */
public interface AnyType {

    /**
     * The type code(typeidx) in WebAssembly. Predefined types have an negative typeidx. Custom types have the positive index in the type section.
     * 
     * @return the code
     */
    public int getCode();
}
