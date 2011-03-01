/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.service;

/**
 * <p>
 * This class is a wrapper for {@link ArticleLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ArticleLocalService
 * @generated
 */
public class ArticleLocalServiceWrapper implements ArticleLocalService {
	public ArticleLocalServiceWrapper(ArticleLocalService articleLocalService) {
		_articleLocalService = articleLocalService;
	}

	/**
	* Adds the article to the database. Also notifies the appropriate model listeners.
	*
	* @param article the article to add
	* @return the article that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.knowledgebase.model.Article addArticle(
		com.liferay.knowledgebase.model.Article article)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.addArticle(article);
	}

	/**
	* Creates a new article with the primary key. Does not add the article to the database.
	*
	* @param articleId the primary key for the new article
	* @return the new article
	*/
	public com.liferay.knowledgebase.model.Article createArticle(long articleId) {
		return _articleLocalService.createArticle(articleId);
	}

	/**
	* Deletes the article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the article to delete
	* @throws PortalException if a article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteArticle(long articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.deleteArticle(articleId);
	}

	/**
	* Deletes the article from the database. Also notifies the appropriate model listeners.
	*
	* @param article the article to delete
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public void deleteArticle(com.liferay.knowledgebase.model.Article article)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.deleteArticle(article);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the article with the primary key.
	*
	* @param articleId the primary key of the article to get
	* @return the article
	* @throws PortalException if a article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.knowledgebase.model.Article getArticle(long articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticle(articleId);
	}

	/**
	* Gets the article with the UUID and group id.
	*
	* @param uuid the UUID of article to get
	* @param groupId the group id of the article to get
	* @return the article
	* @throws PortalException if a article with the UUID and group id could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.knowledgebase.model.Article getArticleByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticleByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Gets a range of all the articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of articles to return
	* @param end the upper bound of the range of articles to return (not inclusive)
	* @return the range of articles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.knowledgebase.model.Article> getArticles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticles(start, end);
	}

	/**
	* Gets the number of articles.
	*
	* @return the number of articles
	* @throws SystemException if a system exception occurred
	*/
	public int getArticlesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticlesCount();
	}

	/**
	* Updates the article in the database. Also notifies the appropriate model listeners.
	*
	* @param article the article to update
	* @return the article that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.knowledgebase.model.Article updateArticle(
		com.liferay.knowledgebase.model.Article article)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.updateArticle(article);
	}

	/**
	* Updates the article in the database. Also notifies the appropriate model listeners.
	*
	* @param article the article to update
	* @param merge whether to merge the article with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the article that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.knowledgebase.model.Article updateArticle(
		com.liferay.knowledgebase.model.Article article, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.updateArticle(article, merge);
	}

	public com.liferay.knowledgebase.model.Article addArticle(long userId,
		long parentResourcePrimKey, java.lang.String title,
		java.lang.String content, java.lang.String description, long priority,
		java.lang.String dirName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.addArticle(userId, parentResourcePrimKey,
			title, content, description, priority, dirName, serviceContext);
	}

	public void addArticleResources(
		com.liferay.knowledgebase.model.Article article,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.addArticleResources(article,
			addCommunityPermissions, addGuestPermissions);
	}

	public void addArticleResources(
		com.liferay.knowledgebase.model.Article article,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.addArticleResources(article, communityPermissions,
			guestPermissions);
	}

	public void addAttachment(long companyId, java.lang.String dirName,
		java.lang.String shortFileName, java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.addAttachment(companyId, dirName, shortFileName,
			inputStream);
	}

	public void checkAttachments()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.checkAttachments();
	}

	public void deleteAttachment(long companyId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.deleteAttachment(companyId, fileName);
	}

	public void deleteGroupArticles(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.deleteGroupArticles(groupId);
	}

	public com.liferay.knowledgebase.model.Article getArticle(
		long resourcePrimKey, int version)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticle(resourcePrimKey, version);
	}

	public java.util.List<com.liferay.knowledgebase.model.Article> getArticles(
		long resourcePrimKey, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticles(resourcePrimKey, status, start,
			end, orderByComparator);
	}

	public java.util.List<com.liferay.knowledgebase.model.Article> getArticles(
		long[] resourcePrimKeys, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticles(resourcePrimKeys, status,
			orderByComparator);
	}

	public int getArticlesCount(long resourcePrimKey, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getArticlesCount(resourcePrimKey, status);
	}

	public java.util.List<com.liferay.knowledgebase.model.Article> getCompanyArticles(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getCompanyArticles(companyId, status,
			start, end, orderByComparator);
	}

	public int getCompanyArticlesCount(long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getCompanyArticlesCount(companyId, status);
	}

	public java.util.List<com.liferay.knowledgebase.model.Article> getGroupArticles(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getGroupArticles(groupId, status, start,
			end, orderByComparator);
	}

	public int getGroupArticlesCount(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getGroupArticlesCount(groupId, status);
	}

	public com.liferay.knowledgebase.model.Article getLatestArticle(
		long resourcePrimKey, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getLatestArticle(resourcePrimKey, status);
	}

	public java.util.List<com.liferay.knowledgebase.model.Article> getSiblingArticles(
		long groupId, long parentResourcePrimKey, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getSiblingArticles(groupId,
			parentResourcePrimKey, status, start, end, orderByComparator);
	}

	public int getSiblingArticlesCount(long groupId,
		long parentResourcePrimKey, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.getSiblingArticlesCount(groupId,
			parentResourcePrimKey, status);
	}

	public java.util.List<com.liferay.knowledgebase.model.Article> search(
		long groupId, java.lang.String title, java.lang.String content,
		int status, java.util.Date startDate, java.util.Date endDate,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.search(groupId, title, content, status,
			startDate, endDate, andOperator, start, end, orderByComparator);
	}

	public void subscribeArticle(long userId, long groupId, long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.subscribeArticle(userId, groupId, resourcePrimKey);
	}

	public void subscribeGroupArticles(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.subscribeGroupArticles(userId, groupId);
	}

	public void unsubscribeArticle(long userId, long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.unsubscribeArticle(userId, resourcePrimKey);
	}

	public void unsubscribeGroupArticles(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.unsubscribeGroupArticles(userId, groupId);
	}

	public com.liferay.knowledgebase.model.Article updateArticle(long userId,
		long resourcePrimKey, long parentResourcePrimKey,
		java.lang.String title, java.lang.String content,
		java.lang.String description, long priority, java.lang.String dirName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.updateArticle(userId, resourcePrimKey,
			parentResourcePrimKey, title, content, description, priority,
			dirName, serviceContext);
	}

	public void updateArticleResources(
		com.liferay.knowledgebase.model.Article article,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.updateArticleResources(article,
			communityPermissions, guestPermissions);
	}

	public void updateAsset(long userId,
		com.liferay.knowledgebase.model.Article article,
		long[] assetCategoryIds, java.lang.String[] assetTagNames)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_articleLocalService.updateAsset(userId, article, assetCategoryIds,
			assetTagNames);
	}

	public java.lang.String updateAttachments(long companyId,
		long resourcePrimKey, java.lang.String dirName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.updateAttachments(companyId,
			resourcePrimKey, dirName);
	}

	public com.liferay.knowledgebase.model.Article updateStatus(long userId,
		long resourcePrimKey, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _articleLocalService.updateStatus(userId, resourcePrimKey,
			status, serviceContext);
	}

	public ArticleLocalService getWrappedArticleLocalService() {
		return _articleLocalService;
	}

	public void setWrappedArticleLocalService(
		ArticleLocalService articleLocalService) {
		_articleLocalService = articleLocalService;
	}

	private ArticleLocalService _articleLocalService;
}