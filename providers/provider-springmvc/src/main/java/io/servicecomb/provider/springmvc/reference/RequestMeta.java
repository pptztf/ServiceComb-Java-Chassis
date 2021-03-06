/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.provider.springmvc.reference;

import java.util.Map;

import io.servicecomb.common.rest.definition.RestOperationMeta;
import io.servicecomb.core.definition.OperationMeta;
import io.servicecomb.core.provider.consumer.ReferenceConfig;

/**
 * 封装每一次调用的元数据
 */
public class RequestMeta {
  private ReferenceConfig referenceConfig;

  private OperationMeta operationMeta;

  private RestOperationMeta swaggerRestOperation;

  private Map<String, String> pathParams;

  public RequestMeta(ReferenceConfig referenceConfig, RestOperationMeta swaggerRestOperation,
      Map<String, String> pathParams) {
    this.referenceConfig = referenceConfig;
    this.operationMeta = swaggerRestOperation.getOperationMeta();
    this.swaggerRestOperation = swaggerRestOperation;
    this.pathParams = pathParams;
  }

  public ReferenceConfig getReferenceConfig() {
    return referenceConfig;
  }

  public Map<String, String> getPathParams() {
    return pathParams;
  }

  public RestOperationMeta getSwaggerRestOperation() {
    return swaggerRestOperation;
  }

  public OperationMeta getOperationMeta() {
    return operationMeta;
  }

  public String getOperationQualifiedName() {
    return operationMeta.getSchemaQualifiedName();
  }
}
