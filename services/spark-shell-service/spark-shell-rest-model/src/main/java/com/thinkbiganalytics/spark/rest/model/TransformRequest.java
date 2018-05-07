package com.thinkbiganalytics.spark.rest.model;

/*-
 * #%L
 * Spark Shell Service REST Model
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.thinkbiganalytics.policy.rest.model.FieldPolicy;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * A request to perform a transformation on a table.
 */
public class TransformRequest {

    /**
     * Indicates the transform should be cached for asynchronous requests
     */
    private boolean async;

    /**
     * List of data sources to make available
     */
    private List<Datasource> datasources;

    /**
     * Whether to perform validation
     */
    private boolean doValidate = true;

    /**
     * Whether to perform profiling
     */
    private boolean doProfile = false;

    /**
     * Previous transformation result
     */
    private Parent parent;

    /**
     * Field validation policies
     */
    private List<FieldPolicy> policies;

    /**
     * Scala script with transformation
     */
    private String script;

    /**
     * Constrain the results returned to the client
     */
    private PageSpec pageSpec;

    /**
     * Indicates the transformation should be cached for asynchronous requests
     */
    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    /**
     * Gets the list of data sources that should be made available to the script.
     *
     * @return the data sources
     */
    public List<Datasource> getDatasources() {
        return datasources;
    }

    /**
     * Sets the list of data sources for the script.
     *
     * @param datasources the data sources
     */
    public void setDatasources(final List<Datasource> datasources) {
        this.datasources = datasources;
    }

    /**
     * Gets the previous transformation result.
     *
     * @return the previous result
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the previous transformation result.
     *
     * @param parent the previous result
     */
    public void setParent(final Parent parent) {
        this.parent = parent;
    }

    /**
     * Gets the standardizers and validators for each field.
     */
    public List<FieldPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<FieldPolicy> policies) {
        this.policies = policies;
    }


    /**
     * Gets the Scala script with the transformation.
     *
     * @return the transformation script
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the Scala script with the transformation.
     *
     * @param script the transformation script
     */
    public void setScript(final String script) {
        this.script = script;
    }

    /**
     * Returns the page index information
     * @return the page spec
     */
    public PageSpec getPageSpec() {
        return pageSpec;
    }

    /**
     * Sets the page index information
     * @param pageSpec the page spec
     */
    public void setPageSpec(PageSpec pageSpec) {
        this.pageSpec = pageSpec;
    }

    /**
     * Whether to perform the validation stage using the configured validation policies
     * @return true if validation stage should be run
     */
    public boolean isDoValidate() {
        return doValidate;
    }

    /**
     * Set whether to perform the validation stage on the results
     * @param doValidate true if validation stage should be performed
     */
    public void setDoValidate(boolean doValidate) {
        this.doValidate = doValidate;
    }

    /**
     * Whether to profile the resultset
     * @return true if profile should be performed
     */
    public boolean isDoProfile() {
        return doProfile;
    }

    /**
     * Set whether profile statistics should be generated for the result
     * @param doProfile true if to perform profiling
     */
    public void setDoProfile(boolean doProfile) {
        this.doProfile = doProfile;
    }

    /**
     * Results of a previous transformation.
     */
    public static class Parent {

        /**
         * Scala script with the transformation
         */
        private String script;

        /**
         * Table containing the results
         */
        private String table;

        /**
         * Gets the Scala script with the transformation.
         *
         * @return the transformation script
         */
        public String getScript() {
            return script;
        }

        /**
         * Sets the Scala script with the transformation.
         *
         * @param script the transformation script
         */
        public void setScript(String script) {
            this.script = script;
        }

        /**
         * Gets the name of the table containing the results.
         *
         * @return the table name
         */
        public String getTable() {
            return table;
        }

        /**
         * Sets the name of the table containing the results.
         *
         * @param table the table name
         */
        public void setTable(String table) {
            this.table = table;
        }


    }
}
